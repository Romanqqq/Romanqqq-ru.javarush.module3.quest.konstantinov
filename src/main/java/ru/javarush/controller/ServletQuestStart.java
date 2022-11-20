package ru.javarush.controller;

import ru.javarush.model.Answer;
import ru.javarush.model.Question;
import ru.javarush.model.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/ServletQuestStart")
public class ServletQuestStart extends HttpServlet {
    private Repository repository;


    @Override
    public void init() throws ServletException {
        repository= new Repository();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if(id!=null){
            int i = Integer.parseInt(id);
            String nextQuestion = repository.getNextQuestion(i);
            List<Answer> answerList=repository.getAnswerByQuestion(i);
            req.setAttribute("question",nextQuestion);
            req.setAttribute("answers",answerList);
            req.getRequestDispatcher("quest.jsp").forward(req,resp);
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
