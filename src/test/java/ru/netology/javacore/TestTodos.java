package ru.netology.javacore;

import org.junit.jupiter.api.Assertions;


public class TestTodos {

    @org.junit.Before
    public void beforeEach() {
        Todos todos = new Todos();

        todos.clear();
    }

    @org.junit.Test
    public void addTodosToListTest() {
        Todos todos = new Todos();
        Boolean success = false;

        todos.addTask("А");
        String task = todos.toString();
        System.out.println("Тест на добавление задачи: " + task);
        todos.addTodosToList();

        for (Todos todoses : Todos.getTodosList()) {
            if (task.equals(todoses.toString())) {
                success = true;
            }
        }

        Assertions.assertTrue(success);
        System.out.println("Успешно");
    }

    @org.junit.Test
    public void removeTaskTest() {
        Todos todos = new Todos();
        String task = "Р";

        todos.addTask(task);
        todos.addTodosToList();
        System.out.println("Тест на удаление задачи: " + Todos.getTodosList());

        todos.removeTodosInList(task);

        Assertions.assertFalse(Todos.getTodosList().contains(task));
        System.out.println("Удаление прошло успешно");
    }

    @org.junit.Test
    public void getAllTask() {
        String task1 = "Я";
        String task2 = "Б";
        String task3 = "М";
        String task4 = "В";

        Todos todos = new Todos();
        todos.addTask(task1);
        todos.addTodosToList();

        Todos todos2 = new Todos();
        todos2.addTask(task2);
        todos2.addTodosToList();


        Todos todos3 = new Todos();
        todos3.addTask(task3);
        todos3.addTodosToList();


        Todos todos4 = new Todos();
        todos4.addTask(task4);
        todos4.addTodosToList();

        System.out.printf("Тест на получение отсортированного списка задач: %s %s %s %s\n", task1, task2, task3, task4);

        Assertions.assertTrue(Todos.getAllTasks().equals("Б В М Я "));
        System.out.println(Todos.getAllTasks() + " : сортировка успешна");
    }
}
