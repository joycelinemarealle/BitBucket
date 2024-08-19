package org.mallon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoListIntegrationTest {
    //Boundary test: test see if item added to a empty list.
    @Test
    public void addingToEmptyListTest(){
        TodoList newList = new TodoList("Empty Todo List");
        TodoItem item = new TodoItem("Boundary Test");

        assertEquals(true, newList.addTodo(item));

        /*assert to see if size of array has become 1 since list initially empty
        cast iterable <TodoItem> to a List <TodoItem>
        then call size of List <TodoITem> */
        assertEquals(1, ((List<TodoItem>) newList.getAllTodos()).size());

    }
}
