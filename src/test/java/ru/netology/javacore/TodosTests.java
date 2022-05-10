package ru.netology.javacore;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTests {
    @Test
    public void testJson() {
        String input = "{ \"type\": \"ADD\", \"task\": \"task #" + "A" + "\" }";
        Gson gson = new Gson();

        Todos todos = gson.fromJson(input, Todos.class);

        Assertions.assertTrue(todos.type.equals("ADD"));
        Assertions.assertTrue(todos.task.equals("task #A"));
    }

}
