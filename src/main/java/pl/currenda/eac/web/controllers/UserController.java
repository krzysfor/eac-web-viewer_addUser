package pl.currenda.eac.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.currenda.eac.web.models.User;
import pl.currenda.eac.web.services.UserService;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @PostMapping("/users") public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("/users/{id}") public void updateUser(@PathVariable String userId, @RequestBody User user){
        userService.updateUser(userId, user);
    }

    @DeleteMapping("/users/{id}") public void deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
    }
}
