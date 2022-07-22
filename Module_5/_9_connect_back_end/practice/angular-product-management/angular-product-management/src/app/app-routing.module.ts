import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {StudentCreateComponent} from "./student/student-create/student-create.component";
import {StudentListComponent} from "./student/student-list/student-list.component";
import {StudentEditComponent} from "./student/student-edit/student-edit.component";


const routes: Routes = [{
  path: '',
  component: StudentListComponent
}, {
  path: 'student/create',
  component: StudentCreateComponent
},{
  path:'student/edit/:id',
  component: StudentEditComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
