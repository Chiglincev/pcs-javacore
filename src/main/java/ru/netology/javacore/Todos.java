package ru.netology.javacore;

import java.util.*;

public class Todos implements Comparable<Todos> {
    private String task;

    private static TreeSet<Todos> todosList = new TreeSet<>();

    public Todos(String task) {
        this.task = task;
    }

    public Todos() {
    }

    public void addTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void addTodosToList() {
        todosList.add(this);
    }

    public static void removeTodosInList(String task) {
        Iterator<Todos> iterator = todosList.iterator();
        while (iterator.hasNext()) {
            Todos todos = iterator.next();
            if (todos.getTask().equals(task)) {
                iterator.remove();
            }
        }
    }

    public static TreeSet<Todos> getTodosList() {
        return todosList;
    }

    public static String getAllTasks() {
        StringBuilder output = new StringBuilder();
        for (Todos todos: todosList) {
            output.append(todos.toString()).append(' ');
        }
        return output.toString();
    }

    public static void clear() {
        todosList.clear();
    }

    @Override
    public String toString() {
        return task;
    }

    @Override
    public int compareTo(Todos o){
        return task.compareTo(o.task);
    }
}
