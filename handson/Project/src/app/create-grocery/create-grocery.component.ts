import { Component , OnInit } from '@angular/core';
import { Grocery } from '../grocery';
import { GroceryService } from '../grocery.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-create-grocery',
  templateUrl: './create-grocery.component.html',
  styleUrls: ['./create-grocery.component.css']
})
export class CreateGroceryComponent implements OnInit {
  grocery: Grocery = new Grocery();
  constructor(private groceryService: GroceryService, private router: Router) { }

  ngOnInit(): void {
      
  }

  saveGrocery(){
    this.groceryService.createGrocery(this.grocery).subscribe(data =>{
      console.log(data);
      this.goToGroceryList();
    },
    error => console.log(error));
  }
  goToGroceryList(){
    this.router.navigate(['/grocerys-list']);

}
onSubmit(){
  console.log(this.grocery);
  this.saveGrocery();
}
}
