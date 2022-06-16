package com.shweta.inventory.services;

import com.shweta.inventory.exceptions.MyCustomException;
import com.shweta.inventory.model.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(Category category);

    Category updateCategory(Category category, int id);

    Category updateOnlyName(int id);

    void deleteCategory (int id) throws MyCustomException;

    List<Category> getAllCategories();

    Category getCategoryById(int id);

    List<Category> getCategoryByName(String name);

    Category getCategoryByNameAndId(String name, int id);

    /*List<Product> getProductByPagination(int pageNo, int pageSize);

    List<Product> getProductsByPagination_Sorting(int pageNo, int pageSize,String sortField);

    //for pagination with custom query
    List<Product> getHighestPriceWithPagination(int pageNo, String field);

    List<Product> getPriceGreaterThan(Long salary);*/
}
