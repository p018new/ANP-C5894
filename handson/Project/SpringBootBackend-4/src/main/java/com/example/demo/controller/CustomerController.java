package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;

import jakarta.annotation.PostConstruct;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
   
public class CustomerController {
    // Hardcoding the admin credentials
    private static final String EXPECTED_USERNAME = "newuser";
    private static final String EXPECTED_PASSWORD = "cust123";
    // A simple flag to track the login status
    private boolean isLoggedIn = false;  
    @PostMapping("/login1")
    public ResponseEntity<Map<String, String>> customerLogin(@RequestBody Customer customer) {
        // Check if the provided credentials match the hardcoded admin credentials
        if (EXPECTED_USERNAME.equals(customer.getUsername()) && EXPECTED_PASSWORD.equals(customer.getPassword())) {
            // Set the login status to true
            isLoggedIn = true;
            // Return a success message if credentials are correct
            Map<String, String> response = new HashMap<>();
            response.put("status", "success");
            response.put("message", "Customer login successful");
            return ResponseEntity.ok(response);
        } else {
            // Return an error message if credentials are incorrect
            Map<String, String> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "Customer not found");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
    @PostMapping("/logout1")
    public ResponseEntity<Map<String, String>> customerLogout() {
        // Set the login status to false
        isLoggedIn = false;
        // Return a success message for logout
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Customer logout successful");
        return ResponseEntity.ok(response);
    }
}