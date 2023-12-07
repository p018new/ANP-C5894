import { Component } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-dairy',
  templateUrl: './dairy.component.html',
  styleUrls: ['./dairy.component.css']
})
export class DairyComponent {
  constructor(public cartService: CartService, private router: Router) {
    this.cartService.cartItems$.subscribe(cartItems => {
      console.log('Cart Items:', cartItems);
      console.log('Total Price:', this.cartService.calculateTotal());
    });
  }

  buy(dairyName: string, price: number) {
    // Add the selected fruit to the cart
    const selectedItem = { name: dairyName, price: price };
    this.cartService.addToCart(selectedItem);
    this.router.navigate(['cart']);
  }
  }
