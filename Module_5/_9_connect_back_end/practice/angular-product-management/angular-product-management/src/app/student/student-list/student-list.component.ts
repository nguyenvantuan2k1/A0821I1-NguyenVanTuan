import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";
import {StudentService} from "../../service/student.service";

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {
  name:string;
  id:number;
  constructor(private studentService:StudentService) {
    studentService.getAll().subscribe(next=>{
      this.students=next;
    })
  }
  students:Student[]=[];
  ngOnInit(): void {
  }

  DeleteStudent(id: number) {
    this.studentService.deleteById(id).subscribe(next=>{
      this.students=this.students.filter(eachProduct=>eachProduct.id!==id)
    });
  }

  Xoa(name: string, id: number) {
    this.name=name;
    this.id=id;
  }
}
