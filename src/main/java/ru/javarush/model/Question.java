package ru.javarush.model;

import lombok.Getter;

import java.util.List;
@Getter
public class Question {
    private String text;
    private Integer currentQuestion;
    private List<Answer> answerList;

    public Question(String text, Integer currentQuestion, List<Answer> answerList) {
        this.text = text;
        this.currentQuestion = currentQuestion;
        this.answerList = answerList;
    }

}
