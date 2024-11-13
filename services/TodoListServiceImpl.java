package services;

import entities.TodoList;
import repositories.TodoListRepositories;

public class TodoListServiceImpl implements TodoListService{

    private final TodoListRepositories todoListRepositories;

    public TodoListServiceImpl(TodoListRepositories todoListRepositories) {
        this.todoListRepositories = todoListRepositories;
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRepositories.getAll();
    }

    @Override
    public void addTodoList(String todo) {
        if(todo.isEmpty() || todo.isBlank()){
            System.out.println("Masukan todo dengan benar");
            return;
        }
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRepositories.add(todoList);
    }

    @Override
    public Boolean removeTodoList(Integer number) {
        return todoListRepositories.remove(number);
    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        TodoList todoList = new TodoList();
        todoList.setId(number);
        todoList.setTodo(todo);
        return todoListRepositories.edit(todoList);
    }
}