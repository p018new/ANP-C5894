import { Component } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-colddrink',
  templateUrl: './colddrink.component.html',
  styleUrls: ['./colddrink.component.css']
})
export class ColddrinkComponent {
  constructor(public cartService: CartService, private router: Router) {
    this.cartService.cartItems$.subscribe(cartItems => {
      console.log('Cart Items:', cartItems);
      console.log('Total Price:', this.cartService.calculateTotal());
    });
  }

  buy(colddrinkName: string, price: number) {
    // Add the selected fruit to the cart
    const selectedItem = { name: colddrinkName, price: price };
    this.cartService.addToCart(selectedItem);
    this.router.navigate(['cart']);
  }
}
