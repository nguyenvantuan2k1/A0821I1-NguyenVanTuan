import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../../service/customer/CustomerService";
import {Router} from "@angular/router";
import {CustomerType} from "../../models/CustomerType";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  customerTypeList: CustomerType[];
  public maxDate = new Date();
  public minDate = new Date(1900, 1, 1);

  constructor(private _snackBar: MatSnackBar,
    private customerService: CustomerService,
    private router: Router, private form: FormBuilder) {}
  createCustomer = this.form.group({
    customerType: ['', [Validators.required]],
    name: ['', [Validators.required]],
    birthDate: ['', [Validators.required]],
    gender: ['', [Validators.required]],
    idCard: ['', [Validators.required]],
    phone: ['', [Validators.required]],
    email: ['', [Validators.required,Validators.pattern('^[a-z][a-z0-9_\\.]{1,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$')]],
    address: ['', [Validators.required]],
  });

  ngOnInit(): void {
    this.customerService.getCustomerType().subscribe((data) => {
      this.customerTypeList = data;
    }, error => console.log(error));
  }

  onSubmit(createFormCustomer: FormGroup) {
    console.log(createFormCustomer.value);
    this.customerService.addCustomer(createFormCustomer.value).subscribe(
      (data) => {
        this._snackBar.open('Đã thêm thành công', 'Ok',{duration: 2000});
        this.router.navigate(['list-customer']);
      }, error => console.log(error)
    );
  }

}
