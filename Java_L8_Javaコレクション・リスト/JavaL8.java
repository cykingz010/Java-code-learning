/*ArrayListを使ったリスト操作が身につくレッスンです。 
要素の追加、削除、検索方法など、便利なコレクション操作でデータ構造を効率的に扱えるようになります。 
実際のコード例を使って、リスト処理をマスターします。*/

import java.util.ArrayList;
import java.util.Arrays;

public class JavaL8 {
  public static void main(String[] args) {

    /* ArrayListへの要素の追加と取得 */

    // 問題1. String型リストを格納するArrayListのインスタンスを生成して、ArrayList型の変数strArrayに代入してください
    ArrayList<String> strArray = new ArrayList<String>();
    // 問題2. addメソッドを使用して、変数strArrayに Hello, World! を追加してください
    strArray.add("Hello, World!");
    // 問題3. getメソッドを使用して、変数strArrayの先頭の要素を取得して出力してください
    System.out.println(strArray.get(0));


    /* ArrayListの要素数を取得 */

    ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1, 2, 3));
    ArrayList<Integer> newArray = new ArrayList<>();
    // 問題1. sizeメソッドを使用して、リストintArray の要素数を出力してください
    System.out.println(intArray.size());
    // 問題2. isEmptyメソッドを使用して、リストintArray,newArrayが空かどうか調べて出力してください
    System.out.println(intArray.isEmpty());
    System.out.println(newArray.isEmpty());


    /* ArrayListの繰り返し処理 */
    ArrayList<String> greetArray = new ArrayList<>(Arrays.asList("Good mooning", "Hello", "Good evening"));
    ArrayList<Integer> intArray1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    // 問題1. 拡張for文を使用して、リストgreetArrayを変数greetで1つずつ取り出して出力してください
    for (String greet : greetArray) {
      System.out.println(greet);
    }
    // 問題2. forEachメソッドを使用して、リストintArrayを変数numberで1つずつ取り出して出力してください
    intArray1.forEach(number -> {
      System.out.println(number);
    });



    /* 【演習】ArrayListの追加と取得と、要素数の取得を使って、問題を解いてみよう */

    ArrayList<Integer> intArray2 = new ArrayList<>();
    int addNumber = 0;
    // 問題1. リストintArrayに21,13,35を追加してください
    intArray2.add(21);
    intArray2.add(13);
    intArray2.add(35);
    // 問題2. 拡張for文を使用して変数numberで取り出して、変数addNumberに足し合わせてください
    for (int number : intArray2) {
      addNumber += number;
    }
    // 問題3. 変数addNumberをリストintArrayの要素数で割って出力してください
    // 足し合わせた合計値をリストの要素数で割って、平均値を出力してください
    System.out.println(addNumber / intArray2.size());


    /* ArrayListの要素を更新 */

    ArrayList<String> greetArray1 = new ArrayList<>(Arrays.asList("Good mooning", "Hello"));
    // 問題1. setメソッドを使用して、リストgreetArrayの先頭の要素をGood eveningに更新してください
    // この下に解答してください
    greetArray1.set(0, "Good evening");
    // 問題2. リストgreetArrayの先頭の要素を出力してください
    // この下に解答してください
    System.out.println(greetArray1.get(0));


    /* ArrayListから要素を削除 */

    ArrayList<String> greetArray2 = new ArrayList<>(
      Arrays.asList("Good mooning", "Hello", "Good evening")
    );
    ArrayList<Integer> intArray3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    // 問題1. removeメソッドを使用して、リストgreetArrayの先頭の要素を削除して、出力してください
    greetArray2.remove(0);
    System.out.println(greetArray2);
    // 問題2. clearメソッドを使用して、リストintArrayの要素を全てまとめて削除して、出力してください
    intArray3.clear();
    System.out.println(intArray3);
  }
}
