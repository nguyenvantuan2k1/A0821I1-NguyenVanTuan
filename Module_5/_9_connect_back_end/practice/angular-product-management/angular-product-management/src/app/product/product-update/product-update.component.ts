import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {Product} from "../../model/product";
import {ActivatedRoute, ParamMap, Router} from "@angular/router";

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {


  id:number;
  product:Product;
  products: Product[] = [];
  constructor(private productService: ProductService,private activatedRoute :ActivatedRoute,private router :Router) {
    productService.getAll().subscribe(next=>{
      this.products=next;
    });
  }
  ngOnInit(): void {
  this.activatedRoute.paramMap.subscribe((paraMap:ParamMap)=>{
    this.id=Number(paraMap.get('id'));
    })
    this.productService.findProductById(this.id).subscribe(next=>{
      this.product=next;
    });
  }
  submit() {
    this.productService.updateProduct(this.product).subscribe(next=>{
      this.products=next;
      this.ngOnInit();
    },error => {}
    );
    this.router.navigateByUrl("product/list");
  }

  Back() {
    this.router.navigateByUrl("product/list");
  }
}
