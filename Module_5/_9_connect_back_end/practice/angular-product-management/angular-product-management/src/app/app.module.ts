import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule, ReactiveFormsModule} from "@angular/forms";

import {HttpClientModule} from "@angular/common/http";
import { StudentCreateComponent } from './student/student-create/student-create.component';
import { StudentEditComponent } from './student/student-edit/student-edit.component';
import { StudentListComponent } from './student/student-list/student-list.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentCreateComponent,
    StudentEditComponent,
    StudentListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
