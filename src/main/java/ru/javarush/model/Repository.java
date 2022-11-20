package ru.javarush.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    private List<Question> questionList;

    public Repository() {
        this.questionList=Arrays.asList(
                new Question("вопрос 1", 1, Arrays.asList(new Answer("ответ1", 2), new Answer("ответ2", 3))),
                new Question("вопрос2", 2, Arrays.asList(new Answer("ответ3", 3), new Answer("ответ4", 4))),
                new Question("вопрос3", 3, Arrays.asList(new Answer("ответ5", 4), new Answer("ответ6", 1))),
                new Question("вопрос4", 4, Arrays.asList(new Answer("ответ7", 2), new Answer("ответ8", 2)))
                );
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public String getNextQuestion(int id){
        return questionList.stream().filter(question -> question.getCurrentQuestion()==id).
                findFirst().get().getText();
   }
   public List<Answer>getAnswerByQuestion(int id){
        return new ArrayList<>(questionList.stream().filter(question -> question.getCurrentQuestion()==id).
                findFirst().get().getAnswerList());
   }


}

