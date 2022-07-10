import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {Product} from "../../model/product";
import {ActivatedRoute, ParamMap} from "@angular/router";

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {


  id:number;
  product:Product;
  constructor(private productService: ProductService,private activatedRoute :ActivatedRoute) {
  }
  ngOnInit(): void {
  this.activatedRoute.paramMap.subscribe((paraMap:ParamMap)=>{
    this.id=Number(paraMap.get('id'));
    console.log(paraMap.get('id'));
    })
    this.product=this.productService.findProductById(this.id);
    console.log(this.product);
  }
  submit() {
    this.productService.updateProduct(this.product);
  }

}
