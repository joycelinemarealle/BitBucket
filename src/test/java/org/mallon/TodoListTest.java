package org.mallon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TodoListTest {


    //Typical test: test see if item was added
    @Test
    public void testAddToList(){
        TodoItem item = new TodoItem("Task 1");
        TodoList newList = new TodoList("My Todo List");

       //add to list
        boolean result = newList.addTodo(item);

        //assert that addTodo returns true when item added
        assertEquals (true, result);


        /* assert if todos List has elements has next returns true
        if there is an element next in the list which just got added*/
        assertEquals(true, newList.getAllTodos().iterator().hasNext());

        /*assert the item Task 1 title is same as Title is in list
        * using iterable goes to Array returns next element & get its title*/
        assertEquals("Task 1", newList.getAllTodos().iterator().next().getTitle());

        //assert that list is My Todo List
        assertEquals("My Todo List", newList.getName());
    }

    //Boundary test: test see if item added to a empty list.
    @Test

    public void addingToEmptyListTest(){
        TodoList newList = new TodoList("Empty Todo List");
        TodoItem item = new TodoItem("Boundary Test");
        boolean result= newList.addTodo(item);


        assertEquals(true, newList.addTodo(item));
        //assert to see if size of array has become 1 since list initially empty
        assertEquals(1, ((List<TodoItem>) newList.getTodos()).size());

    }

    //Erroneous test put in null
    @Test

    public void addingNulltoList(){
        TodoList newList = new TodoList(" Todo List");
        assertThrows(NullPointerException.class, () -> newList.addTodo(null));
    }

}
