package com.amdocs.userservice.controller;

import com.amdocs.userservice.entity.User;
import com.amdocs.userservice.service.impl.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControllerTest {

    @MockBean
    UserServiceImpl userService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        User validUser = new User();
    }

    @Test
    void getAllUsers() throws Exception {
        User validUser = new User();
        given(userService.getAllUsers()).willReturn((List<User>) validUser);

        mockMvc.perform(get("/api/users/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void getUserById() {
    }

    @Test
    void test1() {
    }

    @Test
    void saveUser() throws Exception {
        User validUser = new User(123L, "Nome nominal", "12345678", "São Carlos", "+5501699887766");


        given(userService.saveUser(any())).willReturn(validUser);

        mockMvc.perform(post("/api/users/")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(validUser)))
                .andExpect(status().isCreated());
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}