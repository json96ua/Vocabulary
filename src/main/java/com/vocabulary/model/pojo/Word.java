package com.vocabulary.model.pojo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue
    private long id;

    private String word;

    private String translation;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public Word() {
    }

    public Word(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public Word(String word, String translation, User owner) {
        this.word = word;
        this.translation = translation;
        this.owner = owner;
    }

    public User getOwners() {
        return owner;
    }

    public void setOwners(User owner) {
        this.owner = owner;
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
}
