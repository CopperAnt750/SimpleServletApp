package com.simplewebapp.Servlets;

import com.simplewebapp.DAo.TaskDao;
import com.simplewebapp.Model.Task;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tasks/create")
public class CreateTaskServlet extends HttpServlet {

    private TaskDao taskDao;

    @Override
    public void init() throws ServletException {
        taskDao = TaskDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Create task</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/tasks/create\" method=\"post\"></form>\n" +
                "<table>\n" +
                "    <tr>\n" +
                "        <td><lable for=\"taskName\">Task name: </lable></td>\n" +
                "        <td><input type=\"text\" id=\"taskName\" name=\"taskName\"></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><lable for=\"priority\">Priority: </lable></td>\n" +
                "        <td><input type=\"text\" id=\"priority\" name=\"priority\"> </td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "        <td><input type=\"submit\" value=\"Create\"></td>\n" +
                "        <td><input type=\"reset\" value=\"Clear\"></td>\n" +
                "    </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String taskName = request.getParameter("taskName");
        String priority = request.getParameter("priority");
        Task task = new Task(taskName,priority);
        taskDao.create(task);
    }
}
