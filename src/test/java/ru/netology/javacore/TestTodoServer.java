package ru.netology.javacore;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;

public class TestTodoServer {
    @org.junit.Test
    public void testJson() {
        String input = "{ \"type\": \"ADD\", \"task\": \"task #" + "A" + "\" }";
        Gson gson = new Gson();

        JsonTodos todos = gson.fromJson(input, JsonTodos.class);

        Assertions.assertTrue(todos.getType().equals("ADD"));
        Assertions.assertTrue(todos.getTask().equals("task #A"));
    }

}
