import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerService} from "../../../../service/customer/CustomerService";
import {Customer} from 'src/app/models/Customer';
import {ActivatedRoute, ParamMap, Router} from "@angular/router";
import {CustomerType} from "../../models/CustomerType";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.css']
})
export class CustomerEditComponent implements OnInit {
  customerTypeList: CustomerType[];
  id: number;

  constructor(private _snackBar: MatSnackBar,
              private customerService: CustomerService,
              private form: FormBuilder,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
  }

  public maxDate = new Date();
  public minDate = new Date(1900, 1, 1);
  // updateCustomer: FormGroup;
  updateCustomer = this.form.group({
    id: ['', [Validators.required]],
    customerType: ['', [Validators.required]],
    name: ['', [Validators.required]],
    birthDate: ['', [Validators.required]],
    gender: ['', [Validators.required]],
    idCard: ['', [Validators.required]],
    phone: ['', [Validators.required]],
    email: ['', [Validators.required, Validators.pattern('^[a-z][a-z0-9_\\.]{1,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$')]],
    address: ['', [Validators.required]],
  });

  ngOnInit(): void {
    this.customerService.getCustomerType().subscribe((data) => {
      this.customerTypeList = data;
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = Number(paramMap.get('id'));
      this.customerService.findCustomerById(this.id).subscribe((data) => {
        this.updateCustomer.setValue(data);
      });
    });
      console.log('update' + this.updateCustomer);
    });
  }

  onSubmit(updateCustomer: FormGroup) {
    this.customerService.updateCustomer(updateCustomer.value).subscribe(
      (data) => {
        this._snackBar.open('Update thành công', 'Ok',{duration: 2000});
        this.router.navigate(['list-customer']);
      }, error => console.log(error)
    );
  }

}
