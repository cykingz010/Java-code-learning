public class Main {
    public static void main(String[] args) {
        // new一个对象：TodoList
        TodoList todoList = new TodoList();

        // 添加todo
        todoList.addItem("学Java", new MyDate(2024, 6, 10));
        todoList.addItem("看病", new MyDate(2024, 6, 12));

        // 显示所有todo
        todoList.displayAllItems();
    }
}