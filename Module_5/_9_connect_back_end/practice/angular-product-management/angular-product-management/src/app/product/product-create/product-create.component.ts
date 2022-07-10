import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {ProductService} from "../../service/product.service";
import {Route, Router, RouterLink} from "@angular/router";
import {Product} from "../../model/product";

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {


  ngOnInit(): void {
  }
  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
  });
  products: Product[] = [];
  constructor(private productService: ProductService,private router:Router) {
    productService.getAll().subscribe(next=>{
      this.products=next;
    });
  }
  submit() {
    if(this.productForm.valid){
      const product = this.productForm.value;
      product.id=this.products.length+1;
      this.productService.saveProduct(product).subscribe(next=>{
      },error => {},
        () => {
        this.products.push(product);
        }
      );
      this.productForm.reset();
      this.router.navigateByUrl("product/list");
    }
  }
}
