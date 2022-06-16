package com.shweta.inventory.controller;

import com.shweta.inventory.model.Product;
import com.shweta.inventory.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    @Qualifier("productServiceImpl")
    ProductServiceImpl productService;

    @PostMapping("/add")
    ResponseEntity<Product> addCategory(@RequestBody Product product){
        Product p = productService.createProduct(product);
        return new ResponseEntity<Product>(p, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    ResponseEntity<List<Product>> getAllProducts(@RequestBody Product product){
        List<Product> productList = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }

}



