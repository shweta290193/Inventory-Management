package com.shweta.inventory.services;

import com.shweta.inventory.exceptions.MyCustomException;
import com.shweta.inventory.model.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product,int productId);

    Product updateOnlyName(int productId);

    void deleteProduct (int productId) throws MyCustomException;

    List<Product> getAllProducts();

    Product getProductbyId(int productId);

    List<Product> getProductByName(String productName);

    Product getProductByNameAndId(String productName,int productId);

    List<Product> getProductsByCategoryId(int categoryId);

    List<Product> getProductByPagination(int pageNo, int pageSize);

    List<Product> getProductsByPagination_Sorting(int pageNo, int pageSize,String sortField);

    //for pagination with custom query
    List<Product> getHighestPriceWithPagination(int pageNo, String field);

    List<Product> getPriceGreaterThan(Long salary);

}
