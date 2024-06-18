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
  }
}
