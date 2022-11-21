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
                        Arrays.asList(new Answer("Налево", 8,false), new Answer("Прямо", 3,true), new Answer("Направо", 4,true))),
                new Question("Ты пошел налево, на тебя падает кусок потолка. Ты погиб!", 2,
                        Arrays.asList(new Answer(null, 8,false))),
                new Question("Пройдя прямо, ты пришел прямо к выходу, лабиринт оказался не лабиринтом вовсе", 3,
                        Arrays.asList(new Answer("Ты освободился!", 9,true))),
                new Question("Ты встретил толпу скелетов, но так как у них нет глаз, ты смог пройти мимо них." +
                        " Перед тобой очередная развилка, куда на этот раз?", 4,
                        Arrays.asList(new Answer("Налево", 8,false), new Answer("Прямо", 5,true), new Answer("Направо", 6,true))),
                new Question("Пройдя прямо, ты видишь ров, там внизу осиновые колья, что будешь делать?", 5,
                        Arrays.asList(new Answer("Развернешься и пойдешь обратно", 7,false), new Answer("Поробуешь перепрыгнуть", 8,false))),
                new Question("Коридор резко сменяет повороты, на удивление все проходит гладко. Ты находишь еще один выход.", 6,
                        Arrays.asList(new Answer("Ты освободился!", 9,true))),
                new Question("Ты нашпигован отравленными дротиками. Смерть наступила мгновенно", 7,
                        Arrays.asList(new Answer(null, 8,false))),
                new Question("Для тебя игра окончена, хочешь чтобы Акакий тебя воскресил и попытаться ещё раз?", 8,
                        Arrays.asList()),
                new Question("Акакий тебя преследовать не будет. Иди с миром", 9,
                        Arrays.asList(new Answer("Ты освободился!", 9,true)))
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

