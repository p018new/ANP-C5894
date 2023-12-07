import { Component } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-dal',
  templateUrl: './dal.component.html',
  styleUrls: ['./dal.component.css']
})
export class DalComponent {
  constructor(public cartService: CartService, private router: Router) {
    this.cartService.cartItems$.subscribe(cartItems => {
      console.log('Cart Items:', cartItems);
      console.log('Total Price:', this.cartService.calculateTotal());
    });
  }

  buy(dalName: string, price: number) {
    // Add the selected fruit to the cart
    const selectedItem = { name: dalName, price: price };
    this.cartService.addToCart(selectedItem);
    this.router.navigate(['cart']);

  }

}
