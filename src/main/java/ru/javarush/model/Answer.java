package ru.javarush.model;

import lombok.Getter;

@Getter
public class Answer {
    private String text;
    private Integer nextQuestion;
    private boolean winlose;

    public Answer(String text, Integer nextQuestion, boolean winLose) {

        this.text = text;
        this.nextQuestion = nextQuestion;
        this.winlose=winLose;
    }
}
