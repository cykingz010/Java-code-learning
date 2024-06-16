import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // new一个对象：TodoList
        TodoList todoList = new TodoList();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;  //不知道咋判断循环触发，手动加了一个开关，常驻开启……

        while (running) {
            System.out.println("Welcome! plz select wut u need: 1.add ToDo 2.show ToDoList 3.change my ToDo 4.end");
            int choice = scanner.nextInt();         // 从用户输入中读取int，并将其存到choice
            scanner.nextLine();     // 读取换行符：使用 scanner.nextInt() 来读取时，输入流中还会残留一个换行符
                                    //（用户按下回车键时产生）。如不处理，下次使用 scanner.nextLine() 可能会读取换行符而不是预期输入

            switch (choice) {  //根据choice的值来执行
                case 1:
                    System.out.print("plz input your todo title: ");
                    String title = scanner.nextLine();
                    System.out.print("plz input your todo dueDate (YYYY MM DD): ");
                    int year = scanner.nextInt();
                    int month = scanner.nextInt();
                    int day = scanner.nextInt();
                    scanner.nextLine();            // 读取换行符
                    MyDate dueDate = new MyDate(year, month, day);   // 转换日期
                    todoList.addItem(title, dueDate); 
                    break;  // 成功创建一个todo，接下来该重新回到菜单了
                case 2:
                    todoList.displayAllItems();
                    break;
                case 3:
                    System.out.print("pls change ur todo （num）: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // 读取换行符
                    //todoList.setItemDone(index, true);  //待优化：
                    todoList.setItemDone(index);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("cheak your input num!");
                    break;
            }
        }
        scanner.close();
    }
        /* // 添加todo
        todoList.addItem("学Java", new MyDate(2024, 6, 10));
        todoList.addItem("看病", new MyDate(2024, 6, 12));
        
        // 显示所有todo
        todoList.displayAllItems(); */
    
}