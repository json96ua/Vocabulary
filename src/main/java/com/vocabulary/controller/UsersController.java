package com.vocabulary.controller;

import com.vocabulary.model.dto.UserDTO;
import com.vocabulary.model.pojo.User;
import com.vocabulary.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UsersController {


    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return usersService.getAll();
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public UserDTO getUserById(@PathVariable long userId) {
        return usersService.getUserById(userId);
    }

}
