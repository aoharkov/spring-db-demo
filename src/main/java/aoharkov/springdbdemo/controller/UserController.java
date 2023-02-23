package aoharkov.springdbdemo.controller;

import aoharkov.springdbdemo.dto.UserDTO;
import aoharkov.springdbdemo.entity.UserEntity;
import aoharkov.springdbdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        UserDTO user = new UserDTO();
        user.setName(name);
        user.setEmail(email);
        return userService.register(user);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
}
