import { Component } from '@angular/core';
import { CartService } from '../cart.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-fruits',
  templateUrl: './fruits.component.html',
  styleUrls: ['./fruits.component.css']
})
export class FruitsComponent {
  constructor(public cartService: CartService, private router: Router) {
    this.cartService.cartItems$.subscribe(cartItems => {
      console.log('Cart Items:', cartItems);
      console.log('Total Price:', this.cartService.calculateTotal());
    });
  }

  buy(fruitName: string, price: number) {
    // Add the selected fruit to the cart
    const selectedItem = { name: fruitName, price: price };
    this.cartService.addToCart(selectedItem);
    this.router.navigate(['cart']);

    // Display cart content or total price
    // console.log('Cart Items:', this.cartService.getCartItems());
    // console.log('Total Price:', this.cartService.calculateTotal());
    
  }
 

}
