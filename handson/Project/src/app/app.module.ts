import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateGroceryComponent } from './create-grocery/create-grocery.component';
import { GroceryListComponent } from './grocery-list/grocery-list.component';
import { GroceryDetailsComponent } from './grocery-details/grocery-details.component';
import { UpdateGroceryComponent } from './update-grocery/update-grocery.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminLogoutComponent } from './admin-logout/admin-logout.component';
import { HomeComponent } from './home/home.component';
import { FruitsComponent } from './fruits/fruits.component';
import { VeggiesComponent } from './veggies/veggies.component';
import { ColddrinkComponent } from './colddrink/colddrink.component';
import { DalComponent } from './dal/dal.component';
import { CosmeticsComponent } from './cosmetics/cosmetics.component';
import { DetergentsComponent } from './detergents/detergents.component';
import { FrozenfoodComponent } from './frozenfood/frozenfood.component';
import { DairyComponent } from './dairy/dairy.component';
import { PaymentComponent } from './payment/payment.component';
import { CartComponent } from './cart/cart.component';
import { GooglePayButtonModule } from '@google-pay/button-angular'; 
import { ReactiveFormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    CreateGroceryComponent,
    GroceryListComponent,
    GroceryDetailsComponent,
    UpdateGroceryComponent,
    AdminLoginComponent,
    AdminLogoutComponent,
    HomeComponent,
    FruitsComponent,
    VeggiesComponent,
    ColddrinkComponent,
    DalComponent,
    CosmeticsComponent,
    DetergentsComponent,
    FrozenfoodComponent,
    DairyComponent,
    PaymentComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    GooglePayButtonModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
