package ru.netology.javacore;

import java.util.*;
import java.util.stream.Collectors;

public class Todos {
    public String type;
    public String task;

    public void addTask(TreeSet<String> todosList) {
        todosList.add(task.toLowerCase());
    }

    public void removeTask(TreeSet<String> todosList) {
        todosList.remove(task.toLowerCase());
    }

    public String getAllTasks(TreeSet<String> todosList) {
        StringBuilder output = new StringBuilder();
        for (String toDos: todosList) {
            output.append(toDos).append(' ');
        }
        return output.toString();
    }

}
