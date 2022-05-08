package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    private TreeSet<String> todosList = new TreeSet<>();
    public void addTask(String task) {
        todosList.add(task.toLowerCase());
    }

    public void removeTask(String task) {
        todosList.remove(task.toLowerCase());
    }

    public String getAllTasks() {
        StringBuilder output = new StringBuilder();
        for (String toDos: todosList) {
            output.append(toDos).append(' ');
        }
        return output.toString();
    }

}
