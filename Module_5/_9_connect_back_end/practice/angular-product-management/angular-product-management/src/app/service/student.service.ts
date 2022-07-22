import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Student} from "../model/student";
import {Observable, of} from "rxjs";
import {catchError, tap} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private httpClient:HttpClient) {

  }
  students:Student[]=[];
  getAll():Observable<Student[]> {
    return this.httpClient.get<Student[]>("http://localhost:3000/student");
  }
  saveStudent(student:Student): Observable<Student> {
    return this.httpClient.post<Student>("http://localhost:3000/student",student);
  }

  findStudentById(id: number): Observable<Student> {
    const url='http://localhost:3000/student';
    return this.httpClient.get<Student>(`http://localhost:3000/student/${id}`).pipe(tap(_=>console.log('find student by id = '+id)),
      catchError(error => of (null)));
  }

  updateStudent(student: Student):Observable<Student[]> {
    const url='http://localhost:3000/student'+'/'+student.id;
    return this.httpClient.patch<Student>(url,student).pipe(tap(_=>console.log('update student by id = '+student.id)),
      catchError(error => of (null)));
  }

  deleteById(id: number):Observable<Student[]> {
    const url='http://localhost:3000/student'+'/'+id;
    return this.httpClient.delete<Student>(url).pipe(tap(_=>console.log(`delete student by id = ${id}`)),
      catchError(error => of (null)));
  }
}
