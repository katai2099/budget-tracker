package com.spring.budgettracker.service;

import com.spring.budgettracker.model.Category;
import com.spring.budgettracker.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    public List<Category> getCategories(){
        return categoryRepository.findAll();
    }
}
