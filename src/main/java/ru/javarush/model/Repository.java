package ru.javarush.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    private List<Question> questionList;

    public Repository() {
        this.questionList=Arrays.asList(
                new Question("Перед тобой открывается дверь и ты видишь три направления. Куда пойдешь?", 1,
                        Arrays.asList(new Answer("Налево", 2, false), new Answer("Прямо", 3,true), new Answer("Направо",4,true))),
                new Question("Ты пошел налево, на тебя падает кусок потолка, и ты погибаешь!", 2,
                        Arrays.asList(new Answer("ответ3", 3,false), new Answer("ответ4", 4,false))),
                new Question("вопрос3", 3, Arrays.asList(new Answer("ответ5", 4,false), new Answer("ответ6", 1,false))),
                new Question("вопрос4", 4, Arrays.asList(new Answer("ответ7", 2,false), new Answer("ответ8", 2,false)))
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

