pipeline {
    agent any
    stages {
        stage('Checking out the code from SCM'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bgatla/frontend-repo.git']]])
            }
        }
            
        stage('Docker Build and Tag for frontend') {
           steps {
              
              // building the docker image with name mysurvey
                sh 'docker build -t myfrontend .' 
                
                // we’re going to tag our new image and tag name is latest
                sh 'docker image tag myfrontend bgatla/myfrontend:${BUILD_TIMESTAMP}'
               
          }
        }
        stage('Push frontend docker image to docker hub') {
        steps {
            withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                // providing credentials to login into dockerhub with configured credentials
            sh 'docker login -u bgatla -p ${dockerhubpwd}'
           }
           // pushing image to dockerhub
        sh 'docker image push bgatla/myfrontend:${BUILD_TIMESTAMP}'
        
        }
    }

    stage('Checking out the code from SCM for backend'){
            steps{
               checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/bgatla/backend-repo.git']]]) 
            }
        }
    stage('Docker Build and Tag for backend') {
           steps {
              
              // building the docker image with name mysurvey
                sh 'docker build -t mybackend .' 
                
                // we’re going to tag our new image and tag name is latest
                sh 'docker image tag mybackend bgatla/mybackend:${BUILD_TIMESTAMP}'
               
          }
        }
     stage('Push backend docker image to docker hub') {
        steps {
            withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                // providing credentials to login into dockerhub with configured credentials
                sh 'docker login -u bgatla -p ${dockerhubpwd}'
           }
           // pushing image to dockerhub
           sh 'docker image push bgatla/mybackend:${BUILD_TIMESTAMP}'
        }
    }
    
    stage('push to k8s')
    {
        steps {
            sh 'kubectl set image deployment/clusterdeploy container-0=bgatla/myfrontend:${BUILD_TIMESTAMP} -n default'
            sh 'kubectl set image deployment/clusterdeploy container-1=bgatla/mybackend:${BUILD_TIMESTAMP} -n default'
            sh 'kubectl rollout restart deploy clusterdeploy -n default'
        }
    }
    
}
            
}