package com.vocabulary.dao;

import com.vocabulary.model.dto.UserDTO;
import com.vocabulary.model.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

}
