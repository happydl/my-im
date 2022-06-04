package com.ldm.myim.ui.contoller;

import com.ldm.myim.ui.model.request.UserDetailsRequestModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
    @GetMapping
    public String getUser() {
        return "get User was called.";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return "create user was called.";
    }

    @PutMapping
    public String updateUser() {
        return "update user was called.";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called.";
    }
}
