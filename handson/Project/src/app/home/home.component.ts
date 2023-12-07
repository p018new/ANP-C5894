import { Component } from '@angular/core';
import { Grocery } from '../grocery';
import { GroceryService } from '../grocery.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  grocery!: Grocery[]
  constructor(private groceryService: GroceryService, private router: Router) { }

  
  
gotoFruits(){
  this.router.navigate(['fruits']);
}
  gotoVeggies(){
     this.router.navigate(['veggies']);
  }

  gotoColdDrinks(){
    this.router.navigate(['colddrink']);
  }

  gotoDals(){
    this.router.navigate(['dal']);
  }
 gotoDairy(){
  this.router.navigate(['dairy']);
  
 }
 gotoFrozenFood(){
  this.router.navigate(['frozenfood']);
 }
 gotoCosmetics(){
  this.router.navigate(['cosmetics']);
 }
gotoDetergent(){
  this.router.navigate(['detergents']);
}
 }
