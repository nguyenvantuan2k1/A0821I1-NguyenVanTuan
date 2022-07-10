import { Component, OnInit } from '@angular/core';
import {IWord} from "../iword";
import {DictionaryServiceService} from "../service/dictionary-service.service";
import {ActivatedRoute, ParamMap} from "@angular/router";
import {DomSanitizer} from "@angular/platform-browser";

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {
  key:string;
  word :IWord;

  constructor(    private service: DictionaryServiceService,
                  private activatedRoute: ActivatedRoute,
                  private domSanitizer: DomSanitizer) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.key = paramMap.get('word');
      this.word=this.service.findByWord(this.key);
    });
  }

}
