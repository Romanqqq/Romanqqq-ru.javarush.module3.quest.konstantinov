package ru.javarush.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletRestart", value = "/restart")
public class ServletRestart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    request.getSession().invalidate();
    response.sendRedirect("/ServletQuestStart");
    }
}
