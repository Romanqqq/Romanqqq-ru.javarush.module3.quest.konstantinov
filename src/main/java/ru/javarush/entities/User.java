package ru.javarush.entities;

import lombok.Getter;

@Getter
public class User {
    private String name;
    private int countGame;

    public User(String name, int countGame) {
        this.name = name;
        this.countGame= countGame;
    }

}
