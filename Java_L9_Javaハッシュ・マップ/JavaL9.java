/* HashMapを使ったキーバリュー型コレクションの操作を学ぶレッスンです。 
複数のデータ操作機能を実践し、効率的なデータマッピングや検索方法を修得します。 
Javaでのデータ管理に役立つテクニックが満載です。 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaL9 {

  public static void main(String[] args) {

    // 問題1. String型のキーとString型の値のHashMapインスタンスを生成して、変数nameMapに代入してください
    HashMap<String, String> nameMap = new HashMap<>();
    // 問題2. Hashmap.putメソッドを使用して、変数nameMapにキー・値のペア（キー：名前, 値：山田太郎）を追加してください
    nameMap.put("名前", "山田太郎");
    // 問題3. 変数nameMapのキー 名前 に対応する値を変数nameに代入し、出力してください
    String name = nameMap.get("名前");
    System.out.println(name);


    // 問題1. Integer型のキーとString型の値のHashMapインスタンスを生成して、変数nameMapに代入してください
    HashMap<Integer, String> nameMap1 = new HashMap<>();
    // 問題2. 変数nameMapにキー・値のペア（キー：1, 値：山田太郎, キー：2, 値：山田花子）を追加してください
    nameMap1.put(1, "山田太郎");
    nameMap1.put(2, "山田花子");
    // 問題3. 変数nameMapのキー 2 に対応する値を変数nameに代入し、出力してください
    String name1 = nameMap1.get(2);
    System.out.println(name1); // 出力：“山田花子”
    System.out.println(nameMap1.get(1));  // 出力：“山田太郎”


    /* HashMapの要素数を取得 */

    // 問題1.String型のキーとint型の値のHashMapの変数subjectMapに、要素を設定してください
    HashMap<String, Integer> subjectMap = new HashMap<>();
    subjectMap.put("Math", 90);
    subjectMap.put("Science", 70);
    subjectMap.put("Society", 60);
    // 問題2. 変数subjectMapの要素数を取得し、出力してください
    int size = subjectMap.size();
    System.out.println(size);
    


    /* HashMapの繰り返し処理 */

    HashMap<String, String> subjectMap1 = new HashMap<>();
    Set<String> keys = new HashSet<>();   
    Collection<String> values = new ArrayList<>();   
    subjectMap1.put("名前", "山田太郎");
    subjectMap1.put("メールアドレス", "t.yamada@a.b.c.com");
    subjectMap1.put("住所", "東京都新宿区西新宿２丁目８−１");

    // 問題.1 subjectMapオブジェクトのkeySetメソッドを使用して変数keysに代入し、
    // 拡張for文を使用して、変数keyで1つずつ取り出して キー: と結合して出力してください
    keys = subjectMap1.keySet();
    for (String key : keys) {
      System.out.println("キー: " + key);
    }

    // 問題.2 subjectMapオブジェクトのvaluesメソッドを使用して変数valuesに代入し、拡張for文を使用して、
    // 変数valueで1つずつ取り出して "値:" と結合して出力してください
    values = subjectMap1.values();
    for (String value : values) {
      System.out.println("値: " + value);
    }

    // 問題.3 拡張for文を使用して、Entry<String,
    // String>型の変数subjectで1つずつ取り出して、subjectMapに含まれる全てのキー・値を出力してください。
    // 出力形式は、("キー: " + key + ", 値: " + value)
    for (Map.Entry<String, String> subject : subjectMap1.entrySet()) {  
      // 可能是版本不一样， 之前是 Entry<str,str> 现在要写成Map.Entry<str,str>
      String key = subject.getKey();
      String value = subject.getValue();
      System.out.println("キー: " + key + ", 値: " + value);
    }



    /* ArrayListにHashMapを追加 */

    HashMap<String, String> map = new HashMap<>();
    map.put("名前", "Alice");
    map.put("年", "25");
    // 問題1. ArrayListインスタンスを生成して、Map<String, String>型のリストlistWithMapsに代入してください
    ArrayList<Map<String, String>> listWithMaps = new ArrayList<>();
    // 問題.2 addメソッドを使用して、リストlistWithMapsに変数mapを追加してください
    listWithMaps.add(map);



    /* ArrayListからHashMapの取り出し */

    ArrayList<Map<String, String>> listWithMaps1 = new ArrayList<>();
    // HashMapの変数map1を設定します。
    HashMap<String, String> map1 = new HashMap<>();
    map1.put("名前", "Alice");
    map1.put("年", "25");
    // HashMapの変数map2を設定します。
    HashMap<String, String> map2 = new HashMap<>();
    map2.put("名前", "Bob");
    map2.put("年", "30");
    listWithMaps1.add(map1);
    listWithMaps1.add(map2);

    // 問題1. 拡張for文を使用して変数mapで1つずつ取り出して、引数に 名前 を渡してgetメソッドを使用して変数nameに代入し、
    // 名前: と結合して出力してください
    for (Map<String, String> map3 : listWithMaps1) {
      String name2 = map3.get("名前");
      System.out.println("名前: " + name2);
    }

    // 問題2. 拡張for文を使用して変数localMapで1つずつ取り出して、引数に 年 を渡してgetメソッドを使用して変数ageに代入し、
    // 年: と結合して出力してください
    for (Map<String, String> localMap : listWithMaps1) {
      String age = localMap.get("年");
      System.out.println("年: " + age);
    }
  }
}
