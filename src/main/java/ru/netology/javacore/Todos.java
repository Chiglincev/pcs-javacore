package ru.netology.javacore;

import java.util.*;

public class Todos {
    private String type;
    private String task;

    private static TreeSet<String> todosList = new TreeSet<>();

    public void addTask() {
        todosList.add(task);
    }

    public void addTask(String task) {
        todosList.add(task);
    }

    public void removeTask() {
        todosList.remove(task);
    }

    public void removeTask(String task) {
        todosList.remove(task);
    }

    public String getType() {
        return type;
    }

    public String getTask() {
        return task;
    }

    public static TreeSet<String> getTodosList() {
        return todosList;
    }

    public String getAllTasks() {
        StringBuilder output = new StringBuilder();
        for (String toDos: todosList) {
            output.append(toDos).append(' ');
        }
        return output.toString();
    }

    public void clear() {
        type = null;
        task = null;
        todosList.clear();
    }
}
