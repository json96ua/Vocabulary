package com.vocabulary.model.pojo;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Word> wordList;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, Set<Word> vocabularyList) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
