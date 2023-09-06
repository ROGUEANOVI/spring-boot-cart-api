package com.rogueanovi.cartapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rogueanovi.cartapi.model.entitiy.Product;
import com.rogueanovi.cartapi.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository repository;

  @Override
  @Transactional(readOnly = true)
  public List<Product> findAll() {
    return (List<Product>) repository.findAll();
  }

}
