import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {User} from "../user";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  users :User[]=[{email:'tuan@gmail.com',password:'123456'},{email:'admin@gmail.com',password:'123456'},{email:'member@gmail.com',password:'123456'}];
  constructor() {}

  ngOnInit(): void {
  }
  formLogin = new FormGroup({
    email: new FormControl('',[Validators.required,Validators.pattern("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")]),
    password: new FormControl('',[Validators.required,Validators.minLength(6)])
    }
  )

  onSubmit() {
    console.log(this.formLogin);
  }
}
