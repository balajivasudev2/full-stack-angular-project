import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { StudentSurveyComponent } from './student-survey/student-survey.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { ListSurveyDetailsComponent } from './list-survey-details/list-survey-details.component';
import { HttpClientModule } from '@angular/common/http';
import { ViewStudentDetailsComponent } from './view-student-details/view-student-details.component';
import { HomeComponent } from './home/home.component';

@NgModule({

  declarations: [
    AppComponent,
    StudentSurveyComponent,
    ListSurveyDetailsComponent,
    ViewStudentDetailsComponent,
    HomeComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule
  ],

  providers: [],
  bootstrap: [AppComponent]

})


export class AppModule { }
