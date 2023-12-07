import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Grocery } from './grocery';
@Injectable({
  providedIn: 'root'
})
export class GroceryService {
  getGroceryDetails() {
    throw new Error('Method not implemented.');
  }
  private baseURL = "http://localhost:8080/grocerys";
  constructor(private httpClient: HttpClient) { }

  getGroceryList(): Observable<Grocery[]>{
    return this.httpClient.get<Grocery[]>(`${this.baseURL}`);// $ fetching value 
  }
  createGrocery(grocery: Grocery): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, grocery);
  }
  getGroceryById(id: number): Observable<Grocery>{
    return this.httpClient.get<Grocery>(`${this.baseURL}/${id}`);
  }
  updateGrocery(id: number, grocery: Grocery): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${id}`, grocery);
  }
  deleteGrocery(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

}
