package com.vocabulary.service;

import com.vocabulary.dao.WordDAO;
import com.vocabulary.model.dto.WordDTO;
import com.vocabulary.model.pojo.User;
import com.vocabulary.model.pojo.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordsService {

    @Autowired
    WordDAO wordDAO;

    public void addWord(WordDTO wordDTO) {
        Word word = new Word();
        word.setWord(wordDTO.getWord());
        word.setTranslation(wordDTO.getTranslation());
        word.setOwners(wordDTO.getOwner());

        wordDAO.save(word);
    }

    public List<Word> getAllWords() {
        return wordDAO.findAll();
    }

    public List<Word> getWordsByUser(long userId) {
        User user = new User();
        user.setId(userId);
        return wordDAO.findAllByOwner(user);
    }

}
