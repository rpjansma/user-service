package com.example.trainingproject.model.dao;

import com.example.trainingproject.model.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDao {

    UserEntity user;

    public void UserDao(UserEntity user) {
        this.user = user;
    }

}
