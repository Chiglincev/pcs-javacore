package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;


public class TestTodos {
    static Todos todos = new Todos();

    @org.junit.Before
    public void beforeEach() {
        todos.clear();
    }

    @org.junit.Test
    public void addTaskTest() {
        todos.addTask("А");

        Assertions.assertTrue(Todos.getTodosList().contains("А"));
    }

    @org.junit.Test
    public void removeTaskTest() {
        todos.addTask("А");

        todos.removeTask("А");

        Assertions.assertFalse(Todos.getTodosList().contains("А"));
    }

    @org.junit.Test
    public void getAllTask() {
        todos.addTask("Я");
        todos.addTask("В");
        todos.addTask("Б");
        todos.addTask("М");

        Assertions.assertTrue(todos.getAllTasks().equals("Б В М Я "));
    }
}
