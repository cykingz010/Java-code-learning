// TodoItem的作用主要是用于定义一个新的待办事项。
// 待办事项应该具有的属性： 
// title：用来存储对待办事项的名字，string类型；
// dueDate：用来存储具体的时间，本来计划使用string来存储，后改为MyDate类型；
// isDone：用来标记待办事项是否完成，创建时默认为false；boolean类型；

public class TodoItem {
    private String title;
    private MyDate dueDate;   // 截止日期 DDL
    private boolean isDone;

    // 熟记类的组成：通常除了变量，还有构造方法，用于初始化待办事项
    // 方法TodoItem，需要定义字符串，时间，状态
    public TodoItem(String title, MyDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isDone = false;
    }

    // 方法displayInfo：显示待办事项的信息
    public String displayInfo() {
        String formattedDateTime = dueDate.toString();
        // 可以用更简单的写法：String status = isDone ? "[done]" : "[doing]";
        String status;
        if (isDone) {
            status = "[done]";
        } else {
            status = "[doing]";
        }

        return title + " (期限: " + formattedDateTime + ") " + status;
    }

    // Getters and setters
    public String getTitle() {  // 用于获取新的待办title
        return title;
    }

    public void setTitle(String title) {   // 对应的赋值title
        this.title = title;
    }

    public MyDate getDueDate() {  // 获取todo的截止日期
        return dueDate;
    }

    public void setDueDate(MyDate dueDate) {  // 设置todo截止日期（setter）
        this.dueDate = dueDate;
    }

    public boolean isDone() {  // 判断todo是否完成
        return isDone;
    }

    public void setDone(boolean isDone) {    // 设置todo状态
        this.isDone = isDone;
    }
}

// 最初是考虑手写string直接存到main里的，但想了想总觉得很奇怪对不对……？
// 自定义日期类：如果不使用额外的java包（import java.time.LocalDate;），好像只能造一个类似的……
// 日期需要年月日，由于不考虑小数所以用int类型；

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 别的语言里我记得也有这个语法啊…… python是不是有toString来着？
    // 这个主要是为了显示的时候能够把日期以字符串形式输出
    // 比如我们存了一个date （2024，06，11），输出的时候让他println(date.toString)
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);   // 格式为YYYY-MM-DD，
        // %04d：表示一个int，四位数字表示，不足四位时在前面补零  
    }

    // Getters and setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}