package com.shweta.inventory.controller;

import com.shweta.inventory.model.Category;
import com.shweta.inventory.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    @Qualifier("categoryServiceImpl")
    CategoryService categoryService;

    @PostMapping("/add")
    ResponseEntity<Category> addCategory(@RequestBody Category category){
        Category c = categoryService.createCategory(category);
        return new ResponseEntity<Category>(c, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    ResponseEntity<List<Category>> getAllCategories(@RequestBody Category category){
        List<Category> categoryList = categoryService.getAllCategories();
        return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
    }
}
