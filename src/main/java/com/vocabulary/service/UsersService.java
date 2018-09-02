package com.vocabulary.service;

import com.vocabulary.dao.UserDAO;
import com.vocabulary.model.dto.UserDTO;
import com.vocabulary.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UsersService {

    @Autowired
    private UserDAO userDAO;

    public List<User> getAll() {
        return userDAO.findAll();
    }

    public UserDTO getUserById(long id) {
        User user = userDAO.findOne(id);
        return new UserDTO(user.getName());
    }

}
