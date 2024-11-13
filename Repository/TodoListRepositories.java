package repositories;

import entities.TodoList;

public interface TodoListRepositories {
    TodoList[] getAll();
    void add (TodoList todoList);
    Boolean remove (Integer id);
    Boolean edit (TodoList todoList);
}