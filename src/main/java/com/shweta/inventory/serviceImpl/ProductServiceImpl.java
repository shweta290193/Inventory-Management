package com.shweta.inventory.serviceImpl;

import com.shweta.inventory.exceptions.MyCustomException;
import com.shweta.inventory.model.Category;
import com.shweta.inventory.model.Product;
import com.shweta.inventory.repository.CategoryRepository;
import com.shweta.inventory.repository.ProductRepository;
import com.shweta.inventory.services.CategoryService;
import com.shweta.inventory.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Product createProduct(Product product) {
        /*Category c= categoryRepository.findById(product.getCategory().getCategoryId()).get();
        product.setCategory(c);*/
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, int productId) {
        return null;
    }

    @Override
    public Product updateOnlyName(int productId) {
        return null;
    }

    @Override
    public void deleteProduct(int productId) throws MyCustomException {

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductbyId(int productId) {
        return null;
    }

    @Override
    public List<Product> getProductByName(String productName) {
        return null;
    }

    @Override
    public Product getProductByNameAndId(String productName, int productId) {
        return null;
    }

    @Override
    public List<Product> getProductsByCategoryId(int categoryId) {
        return null;
    }

    @Override
    public List<Product> getProductByPagination(int pageNo, int pageSize) {
        return null;
    }

    @Override
    public List<Product> getProductsByPagination_Sorting(int pageNo, int pageSize, String sortField) {
        return null;
    }

    @Override
    public List<Product> getHighestPriceWithPagination(int pageNo, String field) {
        return null;
    }

    @Override
    public List<Product> getPriceGreaterThan(Long salary) {
        return null;
    }
}
