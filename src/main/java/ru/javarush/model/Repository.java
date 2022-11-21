package ru.javarush.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    private List<Question> questionList;

    public Repository() {
        this.questionList = Arrays.asList(
                new Question("Перед тобой открывается дверь и ты видишь два направления. Куда пойдешь?", 1,
                        Arrays.asList(new Answer("Налево", 8, false), new Answer("Прямо", 2, true))),
                new Question("Ты пошел прямо, чудом избежал отравленных дротиков, и очередная развилка предстала перед тобой", 2,
                        Arrays.asList(new Answer("Направо", 8, false), new Answer("Налево",3,true))),
                new Question("Сделав верный выбор, ты идешь до очередной развилки", 3,
                        Arrays.asList(new Answer("Прямо", 4, true),new Answer("Налево", 8,false))),
                new Question("Ты встретил толпу скелетов, но так как у них нет глаз, ты смог пройти мимо них." +
                        " Перед тобой очередная развилка, куда на этот раз?", 4,
                        Arrays.asList(new Answer("Налево", 8, false), new Answer("Прямо", 5, true))),
                new Question("Пройдя прямо, ты видишь ров, там внизу осиновые колья, что будешь делать?", 5,
                        Arrays.asList(new Answer("Развернешься и пойдешь обратно", 8, false), new Answer("Поробуешь перепрыгнуть", 6, true))),
                new Question("Коридор резко сменяет повороты, на удивление все проходит гладко. Ты находишь выход из лабиринта", 6,null),
                new Question("Для тебя игра окончена, хочешь чтобы Акакий тебя воскресил и попытаться ещё раз?", 8,null)

        );
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public String getNextQuestion(int id) {
        return questionList.stream().filter(question -> question.getCurrentQuestion() == id).
                findFirst().get().getText();
    }

    public List<Answer> getAnswerByQuestion(int id) {
        return new ArrayList<>(questionList.stream().filter(question -> question.getCurrentQuestion() == id).
                findFirst().get().getAnswerList());
    }


}

