import { Injectable } from '@angular/core';import { BehaviorSubject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CartService {
  // private cartItems: any[] = [];
  private cartItems = new BehaviorSubject<any[]>([]);
  cartItems$ = this.cartItems.asObservable();
  // Add item to the cart
  addToCart(item: any) {
   // this.cartItems.push(item);
   const currentItems = this.cartItems.value;
    const updatedItems = [...currentItems, item];
    this.cartItems.next(updatedItems);
  }
  removeFromCart(item: any) {
    const currentItems = this.cartItems.value;
    const updatedItems = currentItems.filter(existingItem => existingItem !== item);
    this.cartItems.next(updatedItems);
  }
  clearCart() {
    this.cartItems.next([]);
  }

  // Remove item from the cart
  // removeFromCart(item: any): void {
  //   const index = this.cartItems.indexOf(item);
  //   if (index !== -1) {
  //     this.cartItems.splice(index, 1);
  //   }
  // }

  // Get all items in the cart
  // getCartItems(): any[] {
  //   return this.cartItems;
  // }
  getCartItems() {
    return this.cartItems.value;
  }

  // Clear the cart
  // clearCart(): void {
  //   this.cartItems = [];
  // }

  // Calculate the total price of items in the cart
  // calculateTotal(): number {
  //   return this.cartItems.reduce((total, item) => total + item.price, 0);
  // }
  calculateTotal() {
    const cartItems = this.cartItems.value;
    
    // Implement your total calculation logic here
    const total = cartItems.reduce((acc, item) => acc + item.price, 0);

    return total;
  }
}