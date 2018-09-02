package com.vocabulary.model.dto;

import com.vocabulary.model.pojo.User;

public class WordDTO {

    private long id;
    private String word;
    private String translation;
    private User owner;

    public WordDTO(String word, String translation, User owner) {
        this.word = word;
        this.translation = translation;
        this.owner = owner;
    }

    public WordDTO(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public WordDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
