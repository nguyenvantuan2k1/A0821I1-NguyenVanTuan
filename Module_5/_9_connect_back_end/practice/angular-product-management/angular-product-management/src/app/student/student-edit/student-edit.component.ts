import { Component, OnInit } from '@angular/core';
import {Student} from "../../model/student";
import {Group} from "../../model/group";
import {Teacher} from "../../model/teacher";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {StudentService} from "../../service/student.service";
import {TeacherService} from "../../service/teacher.service";
import {GroupService} from "../../service/group.service";

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {
  message:string='';
  id:number;
  student :Student;
  groups:Group[]=[];
  students:Student[]=[];
  teachers:Teacher[]=[];
  tesst=null;
group1=null;
  studentForm: FormGroup = new FormGroup({
    id: new FormControl('',Validators.required),
    name: new FormControl('',[Validators.required,Validators.pattern("[a-z A-z]*")]),
    group:new FormControl('',Validators.required),
    detai:new FormControl('',Validators.required),
    teacher: new FormControl('',Validators.required),
    email: new FormControl('',Validators.email),
    phone:new FormControl('',Validators.pattern("[0-9]{10,12}")),
  });

  constructor(private router: Router,private activatedRoute:ActivatedRoute,private studentService:StudentService,private teacherService:TeacherService,private groupService:GroupService) {
    this.activatedRoute.paramMap.subscribe((paraMap:ParamMap)=>{
      this.id=Number(paraMap.get('id'));
    })
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
    this.studentService.findStudentById(this.id).subscribe(next=>{
      this.student=next;
      this.studentForm.patchValue(this.student);
      console.log(this.student);
      this.tesst=this.studentForm.controls.teacher.value.name;
      this.group1=this.studentForm.controls.group.value.name;
      console.log(this.tesst);
    });

  }
  ngOnInit(): void {
    this.getAll();
  }

  Back() {
    this.router.navigateByUrl("");
  }

  submit() {
    if(this.studentForm.valid){
      this.student = this.studentForm.value;
      this.studentService.updateStudent(this.student).subscribe(next=>{
          this.students=next;
          this.ngOnInit();
        },error => {}
      );
      this.router.navigateByUrl("");
    }else{
      this.message="định dạng sai không thể cập nhật";
    }
  }
}
