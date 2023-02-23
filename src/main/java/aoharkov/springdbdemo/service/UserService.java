package aoharkov.springdbdemo.service;

import aoharkov.springdbdemo.dto.UserDTO;
import aoharkov.springdbdemo.entity.UserEntity;

public interface UserService {

    String register(UserDTO user);

    Iterable<UserEntity> getAllUsers();
}
