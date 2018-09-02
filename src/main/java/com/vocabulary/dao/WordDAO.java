package com.vocabulary.dao;

import com.vocabulary.model.pojo.User;
import com.vocabulary.model.pojo.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordDAO extends JpaRepository<Word, Long> {
    List<Word> findAllByOwner(User user);
}
