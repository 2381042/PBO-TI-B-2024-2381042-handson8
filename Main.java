import entities.TodoList;
import repository.TodoListRepisitoryImpl;
import repository.TodoListRepository;
import services.TodoListService;
import services.TodoListServiceImpl;
import views.TodoListTerminalViewImpl;
import views.TodoListView;

public class Main {
    public static void main (String[] args) {
        TodoListRepository todoListRepository = new TodoListRepisitoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalViewImpl(todoListService);
        todoListView.run();
    }
}