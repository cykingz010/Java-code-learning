/* Javaではさまざまな変数の型が存在しますが、より実践的にJavaの型を学ぶレッスンです。 
var,enum、ジェネリクスの学習を通して、システム開発におけるソースコード読解力の向上が期待できます。 */

import java.util.ArrayList;
import java.util.Random;

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

enum Omikuji {
  DAIKICHI("大吉"),
  CHUKICHI("中吉"),
  SHOKICHI("吉"),
  KICHI("末吉"),
  KYO("凶");

  private final String fortune;

  // enum型に 大吉 などの文字列を定義するため、コンストラクタを追加してください
  Omikuji(String fortune) {
    this.fortune = fortune;
  }

  public String getFortune() {
    return fortune;
  }
}


public class Java16 {         

  public static <T> void printValue(T value) {
    System.out.println(value);
  }

  
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


    Omikuji result = drawFortune();
    // enum型のメソッドを利用してください
    System.out.println("今日の運勢は" + result.getFortune() + "です。");

    ArrayList<Integer> numberList = new ArrayList<>();
    // 問題1. ジェネリクスを使ったListに値を追加してください
    numberList.add(100);

    printValue(42);
    // 問題2. ジェネリックメソッドを、それぞれ別な型の実引数を渡しながら2回、呼び出してください
    printValue(3.14);
    printValue("Hello");


    Cart<String> shoppingCart = new Cart<>("Apple");
    System.out.println("カートの中身: " + shoppingCart.getItem());
    // 問題2. ジェネリッククラスに、別な型の実引数を渡し、インスタンスを生成してください
    Cart<Integer> numberCart = new Cart<>(100);
    System.out.println("カートの中身: " + numberCart.getItem());
  }

  /**
   * おみくじを引きます。
   *
   * @return おみくじ結果
   */
  private static Omikuji drawFortune() {
    Random random = new Random();
    // enum型の全ての値を取得するメソッドを呼び出してください
    Omikuji[] omikujiValues = Omikuji.values();
    int Index = random.nextInt(omikujiValues.length);

    return omikujiValues[Index];
  }


}

