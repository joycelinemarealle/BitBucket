package org.mallon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoList {
    private String name;

    private List<TodoItem> todos;

    public TodoList(String name) {
        this.name = name;
        this.todos = new ArrayList<>();
    }

    public Iterable<TodoItem> getTodos() {

        return this.getTodos(false);
    }


    public Iterable<TodoItem> getTodos(boolean complete) {
        return this.todos.stream().filter(i -> complete == i.isComplete()).collect(Collectors.toList());
    }

    public Iterable<TodoItem> getAllTodos() {

        return this.todos;
    }

    public String getName() {
        return name;
    }

    public boolean addTodo(TodoItem i) {
        if ( i == null){
            throw new NullPointerException("A null was entered");

        } else {
            this.todos.add(i);
            return true;
        }
    }
}
