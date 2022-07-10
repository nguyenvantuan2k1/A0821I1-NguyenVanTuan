import { Injectable } from '@angular/core';
import {IWord} from "../iword";

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {
  words : IWord[]=[{
    word:"cat",
    mean:"con mèo"
  },{
    word: "dog",
    mean:"con chó"
  },{
    word: "duck",
    mean:"con vịt"
  }];

  constructor() { }
  translate(){

  }
  getAll(){
    return this.words;
  }

  findByWord(key: string) {
    for(let item of this.words){
      if(item.word==key)
        return item;
    }
  }
}
