import repositories.TodoListRepositoryImpl;
import services.TodoListServiceImpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListServiceImpl todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}