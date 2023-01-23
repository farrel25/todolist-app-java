package test.view;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {

        //testShowTodoList();
        //testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learn Java Basic");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Standard Classes");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

//        todoListService.addTodoList("Learn Java Basic");
//        todoListService.addTodoList("Learn Java OOP");
//        todoListService.addTodoList("Learn Java Standard Classes");

        todoListView.addTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Learn Java Basic");
        todoListService.addTodoList("Learn Java OOP");
        todoListService.addTodoList("Learn Java Standard Classes");

        todoListView.removeTodoList();
    }
}
