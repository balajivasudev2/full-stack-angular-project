import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentSurveyComponent } from './student-survey/student-survey.component';
import { ListSurveyDetailsComponent } from './list-survey-details/list-survey-details.component';
import { ViewStudentDetailsComponent } from './view-student-details/view-student-details.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [

{path: 'student-survey', component: StudentSurveyComponent},
{path: 'api', component: ListSurveyDetailsComponent},
{path: 'view-details/:id', component: ViewStudentDetailsComponent},
{path: 'home', component: HomeComponent},
{path: '', redirectTo: 'home', pathMatch: 'full'}

];

@NgModule({
  declarations: [],
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})

export class AppRoutingModule { }
