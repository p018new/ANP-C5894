import { Component, OnInit } from '@angular/core';
import { Grocery } from '../grocery';
import { GroceryService } from '../grocery.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-grocery-list',
  templateUrl: './grocery-list.component.html',
  styleUrls: ['./grocery-list.component.css']
})
export class GroceryListComponent implements OnInit {

  grocerys!: Grocery[];
  constructor(private groceryService: GroceryService, private router: Router) { }

  ngOnInit(): void {
      this.getGrocerys();

}
private getGrocerys(){
  this.groceryService.getGroceryList().subscribe(data => {
    this.grocerys=data;
  })
}
groceryDetails(id: number){
  this.router.navigate(['grocery-details', id]);
}

updateGrocery(id: number){
  this.router.navigate(['update-grocery', id]);
}
deleteGrocery(id: number){
  this.groceryService.deleteGrocery(id).subscribe(data => {
    console.log(data);
    this.getGrocerys();
  })
}

}