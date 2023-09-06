package com.rogueanovi.cartapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rogueanovi.cartapi.model.entitiy.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
