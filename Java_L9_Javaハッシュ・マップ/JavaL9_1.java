import java.util.*;

public class JavaL9_1 {

  public static void main(String[] args) {
    List<Map<String, String>> listWithMaps = new ArrayList<>();

    // 問題1. HashMapににキー・値のペアを設定し、ArrayListに格納してください
    HashMap<String, String> map1 = new HashMap<>();
    map1.put("Alice", "25");
    HashMap<String, String> map2 = new HashMap<>();
    map2.put("Bob", "30");

    listWithMaps.add(map1);
    listWithMaps.add(map2);

    // 問題2.
    // 問題1で作成したリストから、拡張for文(listWithMapsの変数名はmap、map.entrySet()の変数名はentry)を使って、
    // 変数map1とmap2のキー・値を取得し、「名前: Alice: "", 年齢: 25」のように出力してください
    for (Map<String, String> map : listWithMaps) {
      for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println(
          "名前: " + entry.getKey() + ", 年齢: " + entry.getValue()
        );
      }
    }

    /* HashMapから要素を削除 */

    HashMap<String, Integer> nameMap = new HashMap<>();
    nameMap.put("Alice", 90);
    nameMap.put("Bob", 70);
    nameMap.put("Mike", 80);

    // 問題1. 変数nameMapからキー"Bob"に対応する要素を削除してください
    nameMap.remove("Bob");
    // 問題2. 変数nameMapからすべてのデータを削除して空にしてください
    nameMap.clear();


    /* HashMapの要素を調べる */

    HashMap<String, String> colorMap = new HashMap<>();
    String[] searchColors = { "red", "green", "yellow" };
    String[] searchTranslations = { "緑", "青", "黄" };
    colorMap.put("red", "赤");
    colorMap.put("blue", "青");
    colorMap.put("yellow", "黄");

    for (String color : searchColors) {
      // 問題.1 coloMapオブジェクトのcontainsKeyメソッドを使用して、変数colorが存在していたら値を出力してください
      if (colorMap.containsKey(color)) {
        System.out.println(color);
      }
    }

    for (String translations : searchTranslations) {
      // 問題.2 coloMapオブジェクトのcontainsValueメソッドを使用して、変数translationsが存在していたら値を出力してください
      if (colorMap.containsValue(translations)) {
        System.out.println(translations);
      }
    }



    /* HashMapの要素の取得を使って */
    HashMap<String, Integer> fruitMap = new HashMap<>();
    fruitMap.put("apple", 100);
    fruitMap.put("banana", 200);
    fruitMap.put("orange", 300);
    fruitMap.put("grape", 400);

    // 問題1. 変数fruitMapからキー"orange"に対応する要素を削除してください
    fruitMap.remove("orange");

    // 問題2.拡張for文(中の変数名はkey)とkeySet()を使用して、変数fruitMapの全てのキー・値を出力してください。
    // 出力形式は、("キー: " + key + ", 値: " + value)
    for (String key : fruitMap.keySet()) {
      Integer value = fruitMap.get(key);
      System.out.println("キー: " + key + ", 値: " + value);
    }


  }
}
