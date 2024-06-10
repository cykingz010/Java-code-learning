import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// TodoItemクラスの作成
class TodoItem {

  // Todoに必要なフィールドを宣言： 名前、期限、完了したかどうかの状態を持つ
  private String title; //名前
  private LocalDate dueDate; //期限
  private boolean isDone; //完了したかどうかの状態

  // コンストラクタ定義
  public TodoItem(String title, LocalDate dueDate) {   // 这里不需要额外加上isDone，因为默认这个toDo就没开始做，默认值=false；
    this.title = title;
    this.dueDate = dueDate;
    this.isDone = false;  // 这里的疑问：isDone = flase; 是不行的，必须要this.isDone = false
  }

  // Todo名の取得用メソッド定義
  public String getTitle() {  // Getter方法用于获取title的值
    return title; 
  }

  // Todoの完了ステータス変更用メソッド定義
  public void setDone(boolean done) {  //注意setter方法，用于设置isDone的具体状态，那么是需要一个引数的（boolean done)
    this.isDone = done;
  }

  public String displayInfo() {  //设定方法，返回的是一个字符串 「Todoのタイトルや期限、完了済かどうかを表す状態」
    // 出力処理のため、日付の表示形式を生成
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");  //生成一个日期显示格式 yyyy/MM/dd
    // 表示形式に合わせた、日付文字列を取得してください
    String formattedDateTime = dueDate.format(formatter); // 将一个日期转换成相应格式的字符串 这里设置为string

    String status;   //设定状态status，如果isDone = ture，那么就是完成，反之未完成
    if (isDone) {    //这里一开始写的是 if (isDone = ture)，仔细想想 直接isDone就可以，因为isDone 是Boolean格式
        status = "[完了]";
    } else {
        status = "[未完了]";    //也可以简化写成三元表达 String status = isDone ? "[完了]" : "[未完了]";
    }
    return title + " (期限: " + formattedDateTime + ") " + status; //方法最后返回的是字符串，这个字符串包含了 title，期限，状态
  }



}





class Main {
  public static void main(String[] args) {

    /* TodoListクラスの作成にあたり、「期限」を表す「日付情報」を取り扱う必要があります
    そのため、前提知識として「日付情報」を取り扱うことのできる、LocalDateクラスについて学び */

    // ある日付を表すオブジェクトを生成
    LocalDate date = LocalDate.parse("2024-06-10");  // LocalDateクラスのインスタンスを2024年6月10日の日付で生成する
    // ある日付の出力形式を表すオブジェクトを生成する
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");  // DateTimeFormatterクラスのインスタンスを"yyyy/MM/dd"の表示形式で生成する

    // 日付を出力する
    System.out.println(date.format(formatter));
  }
}
