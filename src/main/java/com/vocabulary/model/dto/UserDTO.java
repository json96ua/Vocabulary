package com.vocabulary.model.dto;

public class UserDTO {

    private long userId;
    private String name;

    public UserDTO(String name) {
        this.name = name;
    }

    public UserDTO() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
