package com.spring.budgettracker.controller;

import com.spring.budgettracker.model.Category;
import com.spring.budgettracker.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api/category")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }
}
