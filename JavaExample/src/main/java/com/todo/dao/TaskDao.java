package com.todo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.todo.model.Task;

public class TaskDao {
	private String jdbcURL = "jdbc:mysql://localhost:3306/todo_db";
    private String jdbcUser = "root";
    private String jdbcPass = "root";
    private static final String INSERT_TASK = "INSERT INTO tasks (title, description, completed) VALUES (?, ?, ?)";
    private static final String SELECT_ALL = "SELECT * FROM tasks";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
    }

    public void insertTask(Task task) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_TASK)) {
            ps.setString(1, task.getTitle());
            ps.setString(2, task.getDescription());
            ps.setBoolean(3, task.isCompleted());
            ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Task> selectAllTasks() {
        List<Task> tasks = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_ALL)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tasks.add(new Task(rs.getInt("id"),
                                   rs.getString("title"),
                                   rs.getString("description"),
                                   rs.getBoolean("completed")));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return tasks;
    }
}


