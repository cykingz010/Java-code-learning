// 差不多做了todoItem的工作后，就有了一个又一个的todo可以新建和定义，那就需要有一个存他们的地方
// todolist可以用来实现存放，比如使用数组来存数据……？

//（虽然数据结构里有提到链表、栈，不过不太清楚具体的用法

// todolist需要什么：
// 一个数组：todoItem[]

public class TodoList {
    private TodoItem[] items;  // 用于存储todo的数组，这里很精髓，type[] aryName，type可以是类！
    private int count;  // 当前todo的数量

    // 初始化todolist
    public TodoList() {
        this.items = new TodoItem[10];  // 数组初始容量为10
        this.count = 0;                 // 本来没想过这个计数器，但是后面我们需要判断数组里有多少数据啊……
    }

    // 方法addItem : 用于添加一个新的todo，需要指定title和dueDate
    // 更新：如果用数组存，存多了会炸，要判断一下数组空间然后扩容，或者当数组满了禁止写入
    public void addItem(String title, MyDate dueDate) {

        // 前置判断：如果当前用来存放的数组已满（count == ary.length），扩展数组容量（+1）
        if (count == items.length) {
            TodoItem[] newItems = new TodoItem[items.length + 1]; // 创建一个新的数组newItems，其大小是原数组的扩容+1
            for (int i = 0; i < items.length; i++) {   // for循环，将旧数组（items）的每个元素复制到新数组（newItems）中
                newItems[i] = items[i];
            }
            items = newItems;   // 我称之为灵魂操作：将地址索引指向新数组，这不就有了吗？
        }

        // 创建新的todo并添加到数组中
        TodoItem item = new TodoItem(title, dueDate);  // 这里搞出过小插曲：以前的定义需要同时输入isDone，现在让isDone初始为false了
        // items[count++] = item;   说实话我觉得这个写法我很难理解过来啊
        int index = count;  // 保存当前 count 的值
        items[index] = item;  // 使用保存的 index 进行赋值
        count++;  // 再计数，这不就有了吗？
        System.out.println("a new ToDoItem has been added : " + title);
    }

    // 显示所有todo
    public void displayAllItems() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].displayInfo());
        }
    }
}