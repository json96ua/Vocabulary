package com.vocabulary.controller;

import com.vocabulary.model.dto.WordDTO;
import com.vocabulary.model.pojo.User;
import com.vocabulary.model.pojo.Word;
import com.vocabulary.service.UsersService;
import com.vocabulary.service.WordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/words")
public class WordsController {

    @Autowired
    WordsService wordsService;

    @Autowired
    UsersService usersService;

    @RequestMapping(value = "add/{userId}")
    public void addNewWord(@PathVariable("userId") long userId, @RequestBody WordDTO newWord) {

        WordDTO wordDTO = new WordDTO();
        wordDTO.setWord(newWord.getWord());
        wordDTO.setTranslation(newWord.getTranslation());

        User user = new User();
        user.setId(userId);
        wordDTO.setOwner(user);

        wordsService.addWord(wordDTO);
    }

    @RequestMapping(value = "/")
    public List<Word> getAllWords() {
        return wordsService.getAllWords();
    }

    @RequestMapping(value = "/{userId}")
    public List<Word> getWordsByUserId(@PathVariable long userId) {
        return wordsService.getWordsByUser(userId);
    }

}
