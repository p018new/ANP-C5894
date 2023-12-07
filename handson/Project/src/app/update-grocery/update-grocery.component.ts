import { Component, OnInit } from '@angular/core';
import { Grocery } from '../grocery';
import { GroceryService } from '../grocery.service';
import { ActivatedRoute, Router } from '@angular/router';
@Component({
  selector: 'app-update-grocery',
  templateUrl: './update-grocery.component.html',
  styleUrls: ['./update-grocery.component.css']
})
export class UpdateGroceryComponent implements OnInit{
  id!: number;
  grocery: Grocery = new Grocery();
  constructor(private groceryService: GroceryService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.groceryService.getGroceryById(this.id).subscribe(data => {
      this.grocery = data;
     }, error => console.log(error));
    }
     onSubmit(){
      this.groceryService.updateGrocery(this.id, this.grocery).subscribe(data =>{
        this.goToGroceryList();
      }, error => console.log(error));
    }
      goToGroceryList(){
        this.router.navigate(['/grocerys-list']);
     }

 }
  


