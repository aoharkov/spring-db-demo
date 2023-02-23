package aoharkov.springdbdemo.service.impl;

import aoharkov.springdbdemo.dto.UserDTO;
import aoharkov.springdbdemo.entity.UserEntity;
import aoharkov.springdbdemo.repository.UserRepository;
import aoharkov.springdbdemo.service.UserService;
import aoharkov.springdbdemo.service.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Mapper<UserEntity, UserDTO> mapper;

    @Override
    public String register(UserDTO user) {
        userRepository.save(mapper.mapDTOToEntity(user));
        return "Saved";
    }

    @Override
    public Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
