import { Component, OnInit } from '@angular/core';
import { Student } from '../student';
import { ActivatedRoute } from '@angular/router';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-view-student-details',
  templateUrl: './view-student-details.component.html',
  styleUrls: ['./view-student-details.component.css']
})
export class ViewStudentDetailsComponent implements OnInit {

   id: number
   student: Student

  constructor( private route: ActivatedRoute, private studentservice: StudentService ) { }

  ngOnInit(): void {

   this.id = this.route.snapshot.params['id'];

    this.student = new Student();
    this.studentservice.getStudentById(this.id).subscribe( data => {
    this.student = data;
  });

}

}
