import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Teacher} from "../model/teacher";
import {Group} from "../model/group";

@Injectable({
  providedIn: 'root'
})
export class GroupService {

  constructor(private httpClient :HttpClient) { }
  getAll():Observable<Group[]> {
    return this.httpClient.get<Group[]>("http://localhost:3000/group");
  }
}
