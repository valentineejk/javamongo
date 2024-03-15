package com.example.javamongo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired UserRepository userRepo;

    @GetMapping("/getusers")
    public List<User> getAllUsers (){
        return  userRepo.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@RequestParam Long id){
        return userRepo.findById(id).get();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }
}
