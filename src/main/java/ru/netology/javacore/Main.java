package ru.netology.javacore;

import java.io.IOException;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {

        Todos todos = new Todos();
        TodoServer server = new TodoServer(8989, todos);
        server.start();
//        todos.addTask("Побегать");
//        todos.addTask("Учиться");
//        todos.addTask("Сходить в магазин");
//        todos.addTask("Плавать");
//        todos.addTask("Бегать");
//        todos.addTask("Попрыгать");
//        todos.addTask("Лазать");
//        todos.removeTask("Попрыгать");
//        System.out.println(todos.getAllTasks());
    }
}
