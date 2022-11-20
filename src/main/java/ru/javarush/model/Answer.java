package ru.javarush.model;

import lombok.Getter;

@Getter
public class Answer {
    private String text;
    private Integer nextQuestion;

    public Answer(String text, Integer nextQuestion) {

        this.text = text;
        this.nextQuestion = nextQuestion;
    }
}
