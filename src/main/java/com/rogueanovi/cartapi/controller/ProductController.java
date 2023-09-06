package com.rogueanovi.cartapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogueanovi.cartapi.model.entitiy.Product;
import com.rogueanovi.cartapi.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
@RequestMapping("/api/v1/products")
public class ProductController {

  @Autowired
  private ProductService service;

  @GetMapping("/")
  public List<Product> findAllProducts() {
    return service.findAll();
  }
}
