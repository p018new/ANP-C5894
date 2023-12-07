import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Grocery } from '../grocery';
import { GroceryService } from '../grocery.service';
@Component({
  selector: 'app-grocery-details',
  templateUrl: './grocery-details.component.html',
  styleUrls: ['./grocery-details.component.css']
})
export class GroceryDetailsComponent implements OnInit {

  id!: number;
  grocery!: Grocery;
  constructor(private route: ActivatedRoute, private groceryService: GroceryService, private router: Router) { 
   this.grocery=new Grocery();
  }
  ngOnInit(): void {
    this.id=+this.route.snapshot.params['id'];
    this.groceryService.getGroceryById(this.id).subscribe((data)=>{
     this.grocery=data;
    },
    (error)=> console.log(error)
    );
}
}
