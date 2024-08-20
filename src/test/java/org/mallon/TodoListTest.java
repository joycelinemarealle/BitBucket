package org.mallon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.mockito.Mock;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TodoListTest {
    TodoList newList;

    @Mock
    TodoItem item1;
    TodoItem item2;

    @BeforeEach
    void setUp(){
        item1 = mock(TodoItem.class);
        item2 = mock(TodoItem.class);
        newList = new TodoList("Todo List");

    }

    //Erroneous test put in null
    @Test
    public void addingNulltoList(){
        assertThrows(NullPointerException.class, () -> newList.addTodo(null));
        //assert list size is zero
        assertEquals(0, ((List<TodoItem>) newList.getAllTodos()).size());
    }

    @Test
    public void addTodoTest(){
        assertTrue(newList.addTodo(item1));
    }

    @Test
     public void getAllTodosTest(){
        assertTrue( ((List<TodoItem>) newList.getAllTodos()).contains(item1));
    }

    @Test
    public void getTodosCompleteTest(){
        //if item complete return true
        when(item1.isComplete()).thenReturn(true);

        //add completed item in todos
        newList.addTodo(item1);

        //set todos true
        Iterable<TodoItem> todos = newList.getTodos(true);

        //check if item1 is in todos. Convert iterable to list
        assertTrue(((List<TodoItem>) todos).contains(item1));


        //Test item2 not complete
        when(item2.isComplete()).thenReturn(false);
        newList.addTodo(item2);
        Iterable<TodoItem> todos1 = newList.getTodos(false);
        assertFalse(((List<TodoItem>)todos1).contains(item2));
    }


    @Test
    public void getTodosInCompleteTest(){
        //if item complete return true
        when(item2.isComplete()).thenReturn(false);

        //add completed item in todos
        newList.addTodo(item2);

        //set todos true
        Iterable<TodoItem> todos = newList.getTodos(false);

        //check if item1 is in todos. Convert iterable to list
        assertFalse(((List<TodoItem>) todos).contains(item2));

    }

    @Test
    public void completeAllTest(){
        newList.addTodo(item1);
        newList.addTodo(item2);

        //set mocks
        when(item1.isComplete()).thenReturn(false);
        when(item2.isComplete()).thenReturn(false);

        //test
        assertEquals(2,newList.completeAll());
        verify(item1).isComplete();
        verify(item2).isComplete();


    }
}

