import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-survey',
  templateUrl: './student-survey.component.html',
  styleUrls: ['./student-survey.component.css']
})

export class StudentSurveyComponent implements OnInit {

reason = [
    { "key": "Students", "value": "Students" },
    { "key": "Location", "value": "Location" },
    { "key": "Campus", "value": "Campus" },
    { "key": "Atmosphere", "value": "Atmosphere"},
    { "key": "Dorms Rooms", "value": "Dorms rooms" },
    { "key": "Sports", "value": "Sports"}
  ];

  selectedReason:any = [];

  student: Student=new Student();
  constructor(private studentservice: StudentService, private router: Router) { }
  
  ngOnInit(): void {

  }

   savestudentdetails(){
   this.student.reason = this.selectedReason.toString();
    this.studentservice.createStudent(this.student).subscribe( data =>{
      console.log(data);
      this.goToStudentList();
    },
    error => console.log(error));
  }

  goToStudentList(){
    this.router.navigate(['/student']);
  }

  reasonchange(event:any)
  {
     let index= this.selectedReason.indexOf(event.target.value);
     if(index==-1){
     this.selectedReason.push(event.target.value);
     }     
     else {
     this.selectedReason.splice(index,1);
     }
     console.log(this.selectedReason);
  }

  onSubmit() {
  console.log(this.student);
  alert("Form details submitted");
  this.savestudentdetails();
  }

}
