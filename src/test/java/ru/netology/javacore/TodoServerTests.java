package ru.netology.javacore;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoServerTests {
    @Test
    public void testJson() {
        String input = "{ \"type\": \"ADD\", \"task\": \"task #" + "A" + "\" }";
        Gson gson = new Gson();

        Todos todos = gson.fromJson(input, Todos.class);

        Assertions.assertTrue(todos.getType().equals("ADD"));
        Assertions.assertTrue(todos.getTask().equals("task #A"));
    }

}
