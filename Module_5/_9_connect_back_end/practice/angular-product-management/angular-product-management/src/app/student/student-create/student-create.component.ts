import { Component, OnInit } from '@angular/core';
import {Product} from "../../model/product";
import {Category} from "../../model/category";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Student} from "../../model/student";
import {Group} from "../../model/group";
import {Teacher} from "../../model/teacher";
import {StudentService} from "../../service/student.service";
import {TeacherService} from "../../service/teacher.service";
import {GroupService} from "../../service/group.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-student-create',
  templateUrl: './student-create.component.html',
  styleUrls: ['./student-create.component.css']
})
export class StudentCreateComponent implements OnInit {
  student :Student;
  groups:Group[]=[];
  teachers:Teacher[]=[];
  students:Student[]=[];
  message :string='';
  studentForm: FormGroup = new FormGroup({
    id: new FormControl('',Validators.required),
    name: new FormControl('',[Validators.required,Validators.pattern("[a-z A-z]*")]),
    group:new FormControl('',Validators.required),
    detai:new FormControl('',Validators.required),
    teacher: new FormControl('',Validators.required),
    email: new FormControl('',Validators.email),
    phone:new FormControl('',Validators.pattern("[0-9]{10,12}")),
  });

  constructor(private studentService:StudentService,private teacherService:TeacherService,private groupService:GroupService,private router:Router) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.groupService.getAll().subscribe(next=>{
      this.groups=next;
      console.log(this.groups);
    });
    this.teacherService.getAll().subscribe(next=>{
      this.teachers=next;
      console.log(this.teachers);
    });
    this.studentService.getAll().subscribe(next=>{
      this.students=next;
    });

  }
  submit() {
    if(this.studentForm.valid){
      this.student = this.studentForm.value;
      this.studentService.saveStudent(this.student).subscribe(next=>{
        this.student=next;
          this.students.push(next);
        }
      );
      this.router.navigateByUrl("");
    }else{
      this.message="định dạng sai không thể thêm";
    }
  }

  Back() {
    this.router.navigateByUrl("");
  }
}
