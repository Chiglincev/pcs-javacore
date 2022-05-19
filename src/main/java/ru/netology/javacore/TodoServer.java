package ru.netology.javacore;

import com.google.gson.Gson;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TodoServer {
    private int port;
    private Todos todos;


    public TodoServer(int port, Todos todos){
        this.port = port;
        this.todos = todos;
    }

    public void start() throws IOException {
        Gson gson = new Gson();
        String input;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Starting server at " + port + "...");

            while (true) {
                try (
                    Socket clientSocket = serverSocket.accept();
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
                ) {

                    input = in.readLine();

                    JsonTodos jsonTodos = gson.fromJson(input, JsonTodos.class);
                    String task = jsonTodos.getTask();

                    if (jsonTodos.getType().equals("ADD")) {
                        new Todos(task).addTodosToList();
                    } else {
                        Todos.removeTodosInList(task);
                    }

                    out.println(Todos.getAllTasks());
                }
            }
        }
    }
}
