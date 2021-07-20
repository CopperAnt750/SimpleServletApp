package com.simplewebapp.DAo;

import com.simplewebapp.Model.Task;

import java.util.LinkedList;
import java.util.List;

public class TaskDao {
    private static TaskDao taskDaoInstance = null;

    private TaskDao() {
    }

    public static TaskDao getInstance() {
        if (taskDaoInstance == null) {
            taskDaoInstance = new TaskDao();
            return taskDaoInstance;
        }
        return taskDaoInstance;
    }

    private List<Task> tasks = new LinkedList<>();

    /*
     * Create a new task
     */
    public boolean create(Task task) {
        if (task != null) {
            return tasks.add(task);
        }
        return false;
    }

    /*
     * Find a task with given id
     */
    public Task read(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElse(null);
    }

    /*
     * Update information about task
     * Should also add chek if index != null
     */
    public boolean update(int id, Task task) {
        int index = tasks.indexOf(read(id));
        return tasks.set(id, task) != null;
    }

    /*Dele a task with given id*/
    public boolean delete(int id) {
        return tasks.remove(read(id));
    }

    public List<Task> readAll() {
        return tasks;
    }


}
