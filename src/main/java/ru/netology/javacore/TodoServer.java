package ru.netology.javacore;

import com.google.gson.Gson;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TodoServer {
    private int port;

    public TodoServer(int port, Todos todos) {
        this.port = port;

        ServerSocket serverSocket = new ServerSocket(port);
        Socket clientSocket = serverSocket.accept();
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while (true) {
            //todo парсинг json
        }

        if (in.readLine().equals("get")) {
            out.println(todos.getAllTasks());
        }
    }

    public void start() throws IOException {
        System.out.println("Starting server at " + port + "...");
        //...
    }
}
