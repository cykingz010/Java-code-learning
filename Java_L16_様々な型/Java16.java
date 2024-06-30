/* Javaではさまざまな変数の型が存在しますが、より実践的にJavaの型を学ぶレッスンです。 
var,enum、ジェネリクスの学習を通して、システム開発におけるソースコード読解力の向上が期待できます。 */

// 列挙型を宣言してください
enum Day {
  MONDAY("月曜日"),
  TUESDAY("火曜日"),
  WEDNESDAY("水曜日"),
  THURSDAY("木曜日"),
  FRIDAY("金曜日"),
  SATURDAY("土曜日"),
  SUNDAY("日曜日");

  private final String japaneseName;

  // enum型にコンストラクタを追加してください
  Day(String japaneseName) {                    // コンストラクタを追加    フィールドjapaneseNameへ代入しよう
    this.japaneseName = japaneseName;
  }

  public String getJapaneseName() {
    return japaneseName;
  }

  public static void printAllDays() {
    // enum型の全ての値を表示するループ文を実装してください
    for (Day day : values()) {
      System.out.println(day);
    }
  }

}


public class Java16 {         
  public static void main(String[] args) {
    // 問題1. var変数を宣言してください
    var message = "Hello";
    var number = 100;
    System.out.println("Message: " + message);
    System.out.println("Number: " + number);

    // enumを利用してください
    Day today = Day.MONDAY;   
    // 尽管 Day today = Day.MONDAY; 在语法上看起来像是在创建一个新对象，但实际上它是在引用一个预定义的、不可变且唯一的枚举常量。
    // 这种设计模式使得枚举类型非常适合用来表示一组有限的、相关的常量。

    // 問題2. enum型とswitch文を利用してください
    switch (today) {
      case MONDAY:
        System.out.println(
          "今日は週の初め、" + today.getJapaneseName() + "です。"
        );
        break;
      case FRIDAY:
        System.out.println("今日は週末、" + today.getJapaneseName() + "です。");
        break;
      default:
        // enum型のメソッドを利用してください
        System.out.println("今日は、" + today.getJapaneseName() + "です。");
    }

    System.out.println("=== すべての曜日 ===");
    // enum型の全ての値を取得するメソッドを呼び出してください
		Day.printAllDays();

  }
}

