import {Group} from "./group";
import {Teacher} from "./teacher";

export interface Student {
  id?:number,
  name?:string,
  group?:Group,
  detai?:string,
  teacher?:Teacher,
  email?:string,
  phone?:number
}
