import { Component, OnInit } from '@angular/core';
import {MatDialog} from "@angular/material/dialog";
import {Employee} from "../../models/employee";
import {EmployeeService} from "../../../../service/employee/employee.service";
import {EmployeeDeleteComponent} from "../employee-delete/employee-delete.component";
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  searchId: number;
  searchName: string;
  page = 1;
  employeeList: Employee[] = [];
  constructor(private _snackBar: MatSnackBar,
    private employeeService: EmployeeService,
    public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.employeeService.getEmployee().subscribe(
      (data) => {
        console.log(data);
        this.employeeList = data;
      }, error => console.log(error)
    );
  }

  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(EmployeeDeleteComponent,
      {data: {
        id
        },
        width: '400px'
      }
    );
    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
      this.ngOnInit();
      this._snackBar.open('Đã xoá thành công', 'Ok')
    });
  }

  searchById(): void{
    console.log(this.searchId);
    this.employeeService.findEmployeeId(this.searchId).subscribe((data) => {
      this.employeeList = data;
    });
  }

  searchByName(): void {
    console.log(this.searchName);
    this.employeeService.findEmployeeByName(this.searchName).subscribe((data) => {
      this.employeeList = data;
    });
  }


}
