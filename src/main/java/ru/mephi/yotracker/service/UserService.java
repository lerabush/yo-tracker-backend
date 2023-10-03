package ru.mephi.yotracker.service;

import ru.mephi.yotracker.dto.UserDto;
import ru.mephi.yotracker.entity.User;

import java.util.List;
public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}