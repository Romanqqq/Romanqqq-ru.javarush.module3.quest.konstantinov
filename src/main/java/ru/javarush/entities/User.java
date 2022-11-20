package ru.javarush.entities;

public class User {
    private String name;
    private int countGame;

    public User(String name, int countGame) {
        this.name = name;
        this.countGame= countGame;
    }


    public String getName() {
        return name;
    }

    public int getCountGame() {
        return countGame;
    }
}
