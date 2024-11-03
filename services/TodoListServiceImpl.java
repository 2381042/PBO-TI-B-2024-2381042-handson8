package services;

import entities.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{
    private final TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }


    @Override
    public TodoList[] getTodoList() {
        return todoListRepository.getALL();
    }

    @Override
    public void addTodoList(Integer number) {

    }

    @Override
    public void addTodoList(final String todo) {
        if (todo.isBlank() || todo.isEmpty()) {
            System.out.println("Masukkan todo dengan benar");
            return;
        }
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRepository.add(todoList);
    }

    @Override
    public Boolean removeTodoList(final Integer number) {
        return todoListRepository.remove(number);
    }

    @Override
    public Boolean editTodoList(final Integer number, String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoList.setId(number);
        return todoListRepository.edit(todoList);
    }
}
