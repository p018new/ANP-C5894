import { Component } from '@angular/core';
import { CartService } from '../cart.service'; // Adjust the path
import { FormBuilder, Validators } from '@angular/forms';
@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {
  constructor(public cartService: CartService, private formBuilder: FormBuilder) {}

  // Define the checkout form
  checkoutForm = this.formBuilder.group({
    name: ['', Validators.required],
    address: ['', Validators.required],
    phone: ['', Validators.required]
  });

  // Get the form controls for convenience
  get name() { return this.checkoutForm.get('name'); }
  get address() { return this.checkoutForm.get('address'); }
  get phone() { return this.checkoutForm.get('phone'); }

  removeFromCart(item: any): void {
    // Remove item from the cart
    this.cartService.removeFromCart(item);

    // Display updated cart content or total price
    console.log('Cart Items:', this.cartService.getCartItems());
    console.log('Total Price:', this.cartService.calculateTotal());
  }

  clearCart(): void {
    // Clear the entire cart
    this.cartService.clearCart();

    // Display an empty cart
    console.log('Cart Items:', this.cartService.getCartItems());
    console.log('Total Price:', this.cartService.calculateTotal());
  }
  paymentRequest: google.payments.api.PaymentDataRequest = {
    apiVersion: 2,
    apiVersionMinor: 0,
    allowedPaymentMethods: [
      {
        type: 'CARD',
        parameters: {
          allowedAuthMethods: ['PAN_ONLY', 'CRYPTOGRAM_3DS'],
          allowedCardNetworks: ['AMEX', 'VISA', 'MASTERCARD']
        },
        tokenizationSpecification: {
          type: 'PAYMENT_GATEWAY',
          parameters: {
            gateway: 'example',
            gatewayMerchantId: 'exampleGatewayMerchantId'
          }
        }
      }
    ],
    merchantInfo: {
      merchantId: '12345678901234567890',
      merchantName: 'Demo Merchant'
    },
    transactionInfo:  {
      totalPriceStatus: 'FINAL',
      totalPriceLabel: 'Total',
      totalPrice: '8000',
      currencyCode: 'INR',
      countryCode: 'IN'
    },
  
    
  
   
    callbackIntents: ['PAYMENT_AUTHORIZATION']
  };
  
  onLoadPaymentData = (
    event: Event
  ): void => {
    const eventDetail = event as CustomEvent<google.payments.api.PaymentData>;
    console.log('load payment data', eventDetail.detail);
  }
  
  onPaymentDataAuthorized: google.payments.api.PaymentAuthorizedHandler = (
    paymentData
    ) => {
      console.log('payment authorized', paymentData);
      return {
        transactionState: 'SUCCESS'
      };
    }
  
  onError = (event: ErrorEvent): void => {
    console.error('error', event.error);
  }

  // Submit the checkout form and display the user's information
  onSubmit(): void {
    // Validate the form inputs
    if (this.checkoutForm.invalid) {
      alert('we have proceed for your checkout');
      return;
    }

    // Get the form values
    const name = this.checkoutForm.value.name;
    const address = this.checkoutForm.value.address;
    const phone = this.checkoutForm.value.phone;

    // Display the user's information
    console.log('Name:', name);
    console.log('Address:', address);
    console.log('Phone:', phone);

    // Reset the form
    this.checkoutForm.reset();
  }
}

