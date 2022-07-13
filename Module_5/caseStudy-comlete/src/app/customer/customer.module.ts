import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {CustomerListComponent} from "./customer-list/customer-list.component";
import {CustomerCreateComponent} from "./customer-create/customer-create.component";
import {CustomerEditComponent} from "./customer-edit/customer-edit.component";
import {CustomerDeleteComponent} from "./customer-delete/customer-delete.component";
import {RouterModule} from "@angular/router";
import {MatButtonModule} from "@angular/material/button";
import {MatRadioModule} from "@angular/material/radio";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatDialogModule} from "@angular/material/dialog";
import {MatPaginatorModule} from "@angular/material/paginator";
import {MatTableModule} from "@angular/material/table";
import {BrowserModule} from "@angular/platform-browser";
import {NgxPaginationModule} from "ngx-pagination";



@NgModule({
  declarations: [CustomerListComponent, CustomerCreateComponent, CustomerEditComponent,CustomerDeleteComponent],
    imports: [
        CommonModule,
        BrowserModule,
        RouterModule,
        MatButtonModule,
        MatRadioModule,
        NgxPaginationModule,
        MatFormFieldModule,
        MatInputModule,
        MatDatepickerModule,
        ReactiveFormsModule,
        MatDialogModule,
        FormsModule,
        MatPaginatorModule,
        MatTableModule
    ]
})
export class CustomerModule { }
