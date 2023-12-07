import { Component } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-frozenfood',
  templateUrl: './frozenfood.component.html',
  styleUrls: ['./frozenfood.component.css']
})
export class FrozenfoodComponent {
  constructor(public cartService: CartService, private router: Router) {
    this.cartService.cartItems$.subscribe(cartItems => {
      console.log('Cart Items:', cartItems);
      console.log('Total Price:', this.cartService.calculateTotal());
    });
  }

  buy(frozenfoodName: string, price: number) {
    // Add the selected fruit to the cart
    const selectedItem = { name: frozenfoodName, price: price };
    this.cartService.addToCart(selectedItem);
    this.router.navigate(['cart']);

  }
}
