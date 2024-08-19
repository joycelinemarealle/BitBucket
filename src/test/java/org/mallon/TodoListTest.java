package org.mallon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TodoListTest {

    @Mock
    TodoItem item;

    @BeforeEach
    void setUp(){
        item = mock(TodoItem.class);
        TodoList newList = new TodoList("Todo List");
    }

    //Erroneous test put in null
    @Test
    public void addingNulltoList(){
        //TodoList newList = new TodoList(" Todo List");
        assertThrows(NullPointerException.class, () -> newList.addTodo(null));
        //assert list size is zero
        assertEquals(0, ((List<TodoItem>) newList.getAllTodos()).size());

    }

    @Test

    public void addTodoTest(){

    }

}
