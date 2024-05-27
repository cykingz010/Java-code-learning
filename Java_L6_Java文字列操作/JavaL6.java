public class JavaL6 {
    /* 文字列クラスの操作方法を習得し、Javaでの高度な文字列処理を実行します。 
    検索や変更、フォーマットなど多彩なメソッドを修得します。*/

   

    public static void main(String[] args) {
    
    // StringBuilderを引数なしでインスタンス化して、変数sbに代入して
    StringBuilder sb = new StringBuilder();


    // 引数にABCを渡してStringBuilderをインスタンス化し、変数wordに代入して
    StringBuilder word = new StringBuilder("ABC");
    // 変数wordをtoStringメソッドで文字列に変換し、出力して
    System.out.println(word);                   //疑问：这里的word和 word.toString()有什么区别
    System.out.println(word.toString());
    // appendメソッドを使用して、変数wordにDEFの文字列を追加し、出力して
    word.append("DEF");
    System.out.println(word);


    // 引数にHello, World!を渡してStringBuilderをインスタンス化し、変数word1に代入して
    StringBuilder word1 = new StringBuilder("Hello, World!");
    // deleteメソッドを使用して、変数word1をHello!にして出力して
    word1.delete(5, 12);
    System.out.println(word1);


    final String FILE_NAME = "text.txt";
    final String UNDERSCORE = "_";
    final String DATE_STR = "yyyyMMdd";
    // 問題1. 引数にFILE_NAMEを渡してStringBuilderをインスタンス化し、変数fileNameに代入し
    StringBuilder fileName = new StringBuilder(FILE_NAME);
    // 問題2. 変数fileNameの".txt"を、deleteメソッドで削除し
    fileName.delete(4, 8);
    // 問題3. 変数fileNameに定数UNDERSCORE、DATE_STRをappendメソッドで追加してファイル名を作成して出力し
    fileName.append(UNDERSCORE);
    fileName.append(DATE_STR);
    System.out.println(fileName);

    //insertメソッドを使用して、変数wordのAとBの間とBとCの間に", "を追加した結果を出力し
    word.insert(1, ",");
    word.insert(3, ",");
    System.out.println(word);

    }

  }

  