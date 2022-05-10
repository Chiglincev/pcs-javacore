package ru.netology.javacore;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.TreeSet;

public class TodoServer {
    private int port;
    private Todos todos;
    private TreeSet<String> todosList = new TreeSet<>();


    public TodoServer(int port, Todos todos){
        this.port = port;
        this.todos = todos;
    }

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        System.out.println("Starting server at " + port + "...");

        String task = in.readLine();
        Gson gson = new Gson();
        gson.toJson(task);

        todos = gson.fromJson(task, Todos.class);
        if (todos.type.equals("ADD")) {
            todos.addTask(todosList);
        } else {
            todos.removeTask(todosList);
        }

        out.println(todos.getAllTasks(todosList));
    }
}
