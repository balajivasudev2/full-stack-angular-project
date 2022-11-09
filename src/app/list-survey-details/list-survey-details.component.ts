import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-survey-details',
  templateUrl: './list-survey-details.component.html',
  styleUrls: ['./list-survey-details.component.css']
})
export class ListSurveyDetailsComponent implements OnInit {

  constructor(private studentservice: StudentService, private router: Router) { }

  students: Student[];

  ngOnInit(): void {

  this.getStudent();

  }

   viewdetails(id: number){
    this.router.navigate(['view-details', id]);
  }

   private getStudent(){
    this.studentservice.getStudentList().subscribe(data => {
      this.students = data;
    });
  }

}
