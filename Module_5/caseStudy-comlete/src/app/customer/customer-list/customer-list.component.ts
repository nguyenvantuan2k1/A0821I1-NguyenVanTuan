import {Component, EventEmitter, Input, OnInit, Output, ViewChild} from '@angular/core';
import {Customer} from "../../models/Customer";
import {CustomerService} from "../../../../service/customer/CustomerService";
import {MatDialog} from '@angular/material/dialog';
import {CustomerDeleteComponent} from "../customer-delete/customer-delete.component";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  searchId: number;
  searchName: string;
  page = 1;
  customerList: Customer[];

  constructor(private _snackBar: MatSnackBar,
    private customerService: CustomerService,
    public dialog: MatDialog

  ) { }

  ngOnInit(): void {
    this.customerService.getCustomer().subscribe(
      (data) => {
        console.log(data);
        this.customerList = data;
      }, error => console.log(error)
    );
  }

  openDialogDelete(id: number) {
    const dialogRef = this.dialog.open(CustomerDeleteComponent,
      {data: {
          id
        },
        width: '400px'
      }
    );
    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
        this._snackBar.open('Đã xoá thành công', 'Ok',{duration: 2000});
      this.ngOnInit();
    });
  }

  searchById(): void{
    console.log(this.searchId);
    this.customerService.findCustomerId(this.searchId).subscribe((data) => {
      this.customerList = data;
    });
  }

  searchByName(): void {
    console.log(this.searchName);
    this.customerService.findCustomerByName(this.searchName).subscribe((data) => {
      this.customerList = data;
    });
  }

  sortByName(){

  }
}
