import { Component, OnInit } from '@angular/core';
import {IWord} from "../iword";
import {DictionaryServiceService} from "../service/dictionary-service.service";

@Component({
  selector: 'app-dictionay-page-component',
  templateUrl: './dictionay-page-component.component.html',
  styleUrls: ['./dictionay-page-component.component.css']
})
export class DictionayPageComponentComponent implements OnInit {
  dic:IWord[]=[];
  constructor(private service: DictionaryServiceService) {
  }

  ngOnInit(): void {
    this.getAll()
  }
  getAll(){
    this.dic= this.service.getAll();
  }
}
