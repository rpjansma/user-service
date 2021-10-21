package com.example.userservice.entity.dao;

import com.example.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDao {

    User user;

    public void UserDao(User user) {
        this.user = user;
    }

}
