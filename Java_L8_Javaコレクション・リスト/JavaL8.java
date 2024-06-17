/*ArrayListを使ったリスト操作が身につくレッスンです。 
要素の追加、削除、検索方法など、便利なコレクション操作でデータ構造を効率的に扱えるようになります。 
実際のコード例を使って、リスト処理をマスターします。*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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


    /* 【演習】ArrayListの更新と削除を使って、問題を解いて */

    ArrayList<String> greetArray3 = new ArrayList<>(
      Arrays.asList("Good morning", "Hello", "Good morning", "Good")
    );
    // 問題1. リストgreetArray3の3つ目の要素をGood eveningに更新してください
    greetArray3.set(2,"Good evening");
    // 問題2. リストgreetArray3の最後の要素Goodを削除して、出力してください
    greetArray3.remove(3);
    System.out.println(greetArray3);

    /* ArrayListの要素を調べる */
    final String HELLO = "Hello";
    ArrayList<String> greetArray4 = new ArrayList<>(
      Arrays.asList("Good morning", "Hello", "Good evening")
    );
    // 問題1. indexOfメソッドを使用して、定数HELLOがリストgreetArrayの何番目に存在するか調べて出力してください
    System.out.println(greetArray4.indexOf(HELLO));
    // 問題2. containsメソッドを使用して、定数HELLOがリストgreetArrayに存在するか調べて出力してください
    System.out.println(greetArray4.contains(HELLO));



    /* ArrayListでサブリストの操作 */

    ArrayList<Integer> intArray4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    List<Integer> subArray = new ArrayList<>();
    // 問題1. subListメソッドを使用して、リストintArrayの1,2,3の要素をリストsubArrayに代入してください
    subArray = intArray4.subList(0, 3); // 変数名.subList(始点インデックス, 終点インデックス+1);
    // 問題2. setメソッドを使用して、リストsubArrayの3番目の要素を100に書き換えてください
    subArray.set(2, 100);
    // 問題3. リストintArray, subArrayを直接出力して値を確認してください
    System.out.println(intArray4);
    System.out.println(subArray);


    
    /* ArrayListの並び替え処理 */

    ArrayList<String> rockArray = new ArrayList<>(Arrays.asList("Guns N' Roses", "Extreme", "AC/DC"));
    ArrayList<Integer> intArray5 = new ArrayList<>(Arrays.asList(1, 3, 2, 5, 4));
    // 問題1. Collections.sortメソッドを使用して、リストrockArrayを並び替えて出力してください
    Collections.sort(rockArray);
    System.out.println(rockArray);
    // 問題2. Collections.sortメソッドを使用して、リストintArrayを並び替えて出力してください
    Collections.sort(intArray5);
    System.out.println(intArray5);

  }
}
