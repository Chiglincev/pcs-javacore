package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TodosTests {
    static Todos todos = new Todos();

    @BeforeEach
    public void beforeEach() {
        todos.clear();
    }

    @Test
    public void addTaskTest() {
        todos.addTask("А");

        Assertions.assertTrue(Todos.getTodosList().contains("А"));
    }

    @Test
    public void removeTaskTest() {
        todos.addTask("А");

        todos.removeTask("А");

        Assertions.assertFalse(Todos.getTodosList().contains("А"));
    }

    @Test
    public void getAllTask() {
        todos.addTask("Я");
        todos.addTask("В");
        todos.addTask("А");
        todos.addTask("М");

        Assertions.assertTrue(todos.getAllTasks().equals("А В М Я "));
    }
}
