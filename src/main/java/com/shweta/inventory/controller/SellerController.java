package com.shweta.inventory.controller;

import com.shweta.inventory.model.Seller;
import com.shweta.inventory.serviceImpl.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    @Qualifier("sellerServiceImpl")
    SellerServiceImpl sellerService;

    @PostMapping("/add")
    ResponseEntity<Seller> addCategory(@RequestBody Seller seller){
        Seller s = sellerService.createSeller(seller);
        return new ResponseEntity<Seller>(s, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    ResponseEntity<List<Seller>> getAllSellers(@RequestBody Seller seller){
        List<Seller> sellerList = sellerService.getAllSellers();
        return new ResponseEntity<List<Seller>>(sellerList, HttpStatus.OK);
    }
}
