package com.spring.budgettracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.budgettracker.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class BudgetTrackerApplicationTests {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void login() throws Exception {
        User expected = User.builder()
                .email("test")
                .password("test")
                .lastname("test")
                .firstname("test")
                .id((long) 1)
                .build();
        User post = User.builder()
                .email("test@test.com")
                .password("test")
                .build();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(post);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/auth/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andReturn();

    }

}
