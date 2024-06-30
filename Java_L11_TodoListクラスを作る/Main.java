import java.time.LocalDate;

class Main {
  public static void main(String[] args) {

    /* TodoListクラスの作成にあたり、「期限」を表す「日付情報」を取り扱う必要があります
    そのため、前提知識として「日付情報」を取り扱うことのできる、LocalDateクラスについて学び */

   /*  // ある日付を表すオブジェクトを生成
    LocalDate date = LocalDate.parse("2024-06-10");  // LocalDateクラスのインスタンスを2024年6月10日の日付で生成する
    // ある日付の出力形式を表すオブジェクトを生成する
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");  // DateTimeFormatterクラスのインスタンスを"yyyy/MM/dd"の表示形式で生成する

    // 日付を出力する
    System.out.println(date.format(formatter)); */

    TodoList toDoList = new TodoList(); //生成实例

    // Todoを追加するメソッドを使用
    toDoList.addItem("Javaを学習する", LocalDate.parse("2024-06-10"));

    // Todoの情報を表示するメソッドを使用
    toDoList.showItems();

    // Todoを完了するメソッドを使用
    toDoList.doneItem(0);

    // Todoを削除するメソッドを使用
    toDoList.removeItem(0);
  }
}
