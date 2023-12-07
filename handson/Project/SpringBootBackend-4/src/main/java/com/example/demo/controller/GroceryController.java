package com.example.demo.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.example.demo.repository.GroceryRepository;
import com.example.demo.model.Grocery;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.*;



	
	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	
	public class GroceryController {
		
	@Autowired
	private GroceryRepository grocRep;
	
	@GetMapping("/grocerys")
	public List <Grocery> getAllGrocery(){
		return grocRep.findAll();
	}
	
	@PostMapping("/grocerys")
	public Grocery createGrocery(@RequestBody Grocery grocery) {
		return grocRep.save(grocery);
	}
	@DeleteMapping("/grocerys/{id}")
	public ResponseEntity<Map <String, Boolean>> deleteDepartment(@PathVariable int id) throws ResourceNotFoundException 
	{
		
		Grocery grocery = grocRep.findById(id).orElseThrow(() -> new ResourceNotFoundException("Groceery Not found"));

		grocRep.delete(grocery);
		Map<String, Boolean> response=new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return ResponseEntity.ok(response);
		
	}
	@PutMapping("/grocerys/{id}")
	public ResponseEntity<Grocery> updateGrocery(@RequestBody Grocery groceryDetails, @PathVariable int id) throws ResourceNotFoundException 
	{
		Grocery grocery = grocRep.findById(id).orElseThrow(() -> new ResourceNotFoundException("Grocery not be blank"));
       
        
        grocery.setColdName(groceryDetails.getColdName());
        Grocery updateGrocery=grocRep.save(grocery);
        return ResponseEntity.ok(updateGrocery);
        
	}
	@GetMapping("/grocerys/{id}")
	public ResponseEntity<Grocery> getGroceryById(@PathVariable int id) throws ResourceNotFoundException 
	{
		 Grocery grocery = grocRep.findById(id).orElseThrow(() -> new ResourceNotFoundException("Grocery not found for Id"));
		 return ResponseEntity.ok(grocery);
	}
}
