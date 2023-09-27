package com.example.testsecurity2dbthemeleaf.service;


import com.example.testsecurity2dbthemeleaf.entity.User;
import com.example.testsecurity2dbthemeleaf.dto.UserDto;
import java.util.List;

public interface UserService {

    void saveUser (UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}