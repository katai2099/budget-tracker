package com.spring.budgettracker;

import com.spring.budgettracker.model.Category;
import com.spring.budgettracker.model.User;
import com.spring.budgettracker.repository.CategoryRepository;
import com.spring.budgettracker.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BudgetTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetTrackerApplication.class, args);
    }

    @Bean
    public CommandLineRunner sampleData(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(User.builder()
                    .firstname("test")
                    .lastname("test")
                    .email("test@test.com")
                    .password(
                            "test")
                    .build());
        };
    }

    @Bean
    public CommandLineRunner sampleCategories(CategoryRepository categoryRepository) {
        return (args -> {
            categoryRepository.save(Category.builder()
                    .name("Food")
                    .build());
        });
    }
}
