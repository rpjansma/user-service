package com.amdocs.userservice.controller;

import com.amdocs.userservice.entity.User;
import com.amdocs.userservice.service.impl.UserServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControllerTest {

    @Mock
    UserServiceImpl userService;

    MockMvc mockMvc;

    UserController controller;

    @Autowired
    ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        controller = new UserController(userService);
        User validUser = new User();
        MockitoAnnotations.openMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void getAllUsers() throws Exception {
//        User validUser = new User();
//        given(userService.getUserByid(1L)).willReturn(java.util.Optional.of(validUser));
//
//        mockMvc.perform(get("/api/v1/users").accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());
    }

    @Test
    void getUserById() {
    }

    @Test
    void test1() {
    }

    @Test
    void saveUser() throws Exception {
//        User validUser = new User.builder(123L, "Nome nominal", "12345678", "São Carlos", "+5501699887766");
//
//
//        given(userService.saveUser(any())).willReturn(validUser);
//
//        mockMvc.perform(post("/api/users/")
//                .contentType("application/json")
//                .content(objectMapper.writeValueAsString(validUser)))
//                .andExpect(status().isCreated());
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}