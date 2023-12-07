import { Component } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-cosmetics',
  templateUrl: './cosmetics.component.html',
  styleUrls: ['./cosmetics.component.css']
})
export class CosmeticsComponent {
  constructor(public cartService: CartService, private router: Router) {
    this.cartService.cartItems$.subscribe(cartItems => {
      console.log('Cart Items:', cartItems);
      console.log('Total Price:', this.cartService.calculateTotal());
    });
  }

  buy(cosmeticsName: string, price: number) {
    // Add the selected fruit to the cart
    const selectedItem = { name: cosmeticsName, price: price };
    this.cartService.addToCart(selectedItem);
    this.router.navigate(['cart']);
  }
  }


