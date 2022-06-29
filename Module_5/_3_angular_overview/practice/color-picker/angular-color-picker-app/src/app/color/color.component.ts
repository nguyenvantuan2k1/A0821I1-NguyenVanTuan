import { Component, OnInit } from '@angular/core';
export interface  IStudent {
  id:number;
  name:string;
  dob:string;
  mark:number;
  image:string;
}
@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  student: IStudent={
    id: 1,
    name: 'nguyen van tuan',
    dob: '2001-08-10',
    mark: 8,
    image: 'https://kynguyenlamdep.com/wp-content/uploads/2020/01/hinh-anh-dep-hoa-bo-cong-anh.jpg'
  }
  color={
    color:'black'
  }
  constructor() { }

  ngOnInit(): void {
  }
  // getMark(n:number){
  //   this.student.mark=n;
  // }
  changColor(color:string){
    this.color.color=color;
  }
}
