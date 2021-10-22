package com.amdocs.userservice.service.impl;

import com.amdocs.userservice.entity.User;
import com.amdocs.userservice.repository.UserRepository;
import com.amdocs.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public boolean updateUser(User user) {
        try {
            repository.save(user);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return true;
    }

    @Override
    public Optional<User> getUserByid(Long id) {
        return repository.findById(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
