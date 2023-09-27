package com.example.testsecurity2dbthemeleaf.service;


import ru.urfu.testsecurity2dbthemeleaf.entity.User;
import ru.urfu.testsecurity2dbthemeleaf.dto.UserDto;
import java.util.List;

public interface UserService {

    void saveUser (UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}