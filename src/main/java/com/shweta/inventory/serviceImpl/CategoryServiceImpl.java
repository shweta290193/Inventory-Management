package com.shweta.inventory.serviceImpl;

import com.shweta.inventory.dto.CategoryDTO;
import com.shweta.inventory.exceptions.MyCustomException;
import com.shweta.inventory.model.Category;
import com.shweta.inventory.repository.CategoryRepository;
import com.shweta.inventory.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    //@Autowired


    //converting DTO to Entity
    public Category getDtoToEntity(CategoryDTO categoryDTO){
       /*Category category= Category.builder().
               categoryId(categoryDTO.getCategoryId()).
               categoryName(categoryDTO.getCategoryName())
               .build();*/
        //Category category=
      // return category;
        return null;
    }

    //converting Entity to DTO
    public CategoryDTO getEntityToDto(Category category){
        CategoryDTO categoryDTO= CategoryDTO.builder().
                categoryId(category.getCategoryId()).
                categoryName(category.getCategoryName())
                .build();
        return categoryDTO;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category, int id) {
        Category c=categoryRepository.findById(id).get();
        c.setCategoryId(category.getCategoryId());
        c.setCategoryName(category.getCategoryName());
        return c;
    }

    @Override
    public Category updateOnlyName(int id) {
        Category c=categoryRepository.findById(id).get();
        return null;
    }

    @Override
    public void deleteCategory(int id) throws MyCustomException {

    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public Category getCategoryById(int id) {
        return null;
    }

    @Override
    public List<Category> getCategoryByName(String name) {
        return null;
    }

    @Override
    public Category getCategoryByNameAndId(String name, int id) {
        return null;
    }
}
