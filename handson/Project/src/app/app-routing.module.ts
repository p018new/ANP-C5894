import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateGroceryComponent } from './create-grocery/create-grocery.component';
import { GroceryDetailsComponent } from './grocery-details/grocery-details.component';
import { GroceryListComponent } from './grocery-list/grocery-list.component';
import { UpdateGroceryComponent } from './update-grocery/update-grocery.component'; 
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminLogoutComponent } from './admin-logout/admin-logout.component';
import { HomeComponent } from './home/home.component';
import { FruitsComponent } from './fruits/fruits.component';
import { VeggiesComponent } from './veggies/veggies.component';
import { ColddrinkComponent } from './colddrink/colddrink.component';
import { DairyComponent } from './dairy/dairy.component';
import { FrozenfoodComponent } from './frozenfood/frozenfood.component';
import { CosmeticsComponent } from './cosmetics/cosmetics.component';
import { DetergentsComponent } from './detergents/detergents.component';
import { DalComponent } from './dal/dal.component';
import { CartComponent } from './cart/cart.component';
const routes: Routes = [
  {path: 'grocerys-list', component: GroceryListComponent},
  {path: 'create-grocery', component: CreateGroceryComponent},
  
  //{path: '', component:HomeComponent},
  {path: 'update-grocery/:id', component: UpdateGroceryComponent},
  {path: 'grocery-details/:id', component: GroceryDetailsComponent},
  {path: '', component: AdminLoginComponent},
  {path: 'admin-logout', component: AdminLogoutComponent},
  {path: 'home', component: HomeComponent},
  {path: 'fruits', component: FruitsComponent},
  {path: 'veggies', component: VeggiesComponent},
  {path: 'colddrink', component: ColddrinkComponent},
  {path: 'dairy', component: DairyComponent},
  {path: 'frozenfood', component: FrozenfoodComponent},
  {path: 'cosmetics', component: CosmeticsComponent},
  {path: 'detergents', component: DetergentsComponent},
  {path: 'dal', component: DalComponent},
  {path: 'cart', component: CartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
