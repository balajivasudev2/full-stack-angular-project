#docker file for frontend angular
FROM nginx:1.17.1-alpine
COPY /dist/angular-frontend /usr/share/nginx/html