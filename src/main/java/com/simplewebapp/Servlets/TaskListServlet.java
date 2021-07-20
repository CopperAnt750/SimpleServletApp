package com.simplewebapp.Servlets;

import com.simplewebapp.DAo.TaskDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/tasks/list")
public class TaskListServlet extends HttpServlet {
    private TaskDao taskDao;

    @Override
    public void init() throws ServletException {
        taskDao = TaskDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
