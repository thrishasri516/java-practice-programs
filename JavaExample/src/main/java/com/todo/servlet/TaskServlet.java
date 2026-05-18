package com.todo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todo.dao.TaskDao;
import com.todo.model.Task;
@WebServlet("/Task")
public class TaskServlet extends HttpServlet{
	private TaskDao taskDao;

    public void init() {
        taskDao = new TaskDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        Task newTask = new Task(0, title, description, false);
        taskDao.insertTask(newTask);
        response.sendRedirect("ListTask.jsp");
    }
}


