public class JavaL2 {
    public static void main(String[] args) {
      /*
      論理演算や比較演算を含むJavaの制御フロー処理を学び、 
      プログラムを状況に応じて変化させる技術を身につけます。
      */
      
      //論理積(&&)を使った判定結果を出力
      System.out.println(true && true);
      //論理和(||)を使った判定結果を出力
      System.out.println(false || false);
      //論理否定(!)を使った判定結果を出力
      System.out.println(!false);

      final int TEN = 10;
      final int FIVE = 5;
      //大小比較(>)を使った判定結果を出力
      System.out.println(TEN > FIVE);
      System.out.println(TEN >= TEN);
      //大小比較(<)を使った判定結果を出力
      System.out.println(FIVE < TEN);
      System.out.println(FIVE <= FIVE);

      final int TEN1 = 10;
      final int FIVE1 = 5;
      //等価演算子(==)を使った判定結果を出力
      System.out.println(TEN1 == FIVE1);
      //不等価演算子(!=)を使った判定結果を出力
      System.out.println(TEN1 != FIVE1);

      int ten = 10;
      //変数が10以上かつ20未満がtrueとなる比較文を作成
      System.out.println(ten >= 10 && ten < 20);  // 以上: >=  未満:<
      //変数が20以上または10以下がtrueとなる比較文を作成
      System.out.println(ten >= 20 || ten <= 10);
      //変数が11以上かつ20未満以外がtrueとなる比較文を作成
      System.out.println(!(ten >= 11 && ten < 20));

      final int SCORE = 30;
      //条件式にtrueを使ったif文を実装
      if (true) {
        System.out.println("trueです。");
      }
      //10以上の場合に文字列を出力するif文を実装
      if (SCORE >= 10) {
        System.out.println("実行されました。");
      }
      
      /* 変数の値がtrueであるため、elseの中の処理が実行され、「valueはtrueです。」と表示されます。 */
      boolean value = true;
      if (!value) {
        System.out.println("valueはfalseです。");
      } else {
        System.out.println("valueはtrueです。");   //出力
      }

      
      int score = 70;
      //else節を使って点数80点以上とそれ以外の分岐処理を実装
      if (score >= 80) {
        System.out.println("80点以上です。");
      } else {
        System.out.println("80点未満です。");
      }

      int number = 21;
      // 問題1. else if節を使って2の倍数と3の倍数の分岐処理を実装
      // この下に解答してください
      if (number % 2 == 0) {
        System.out.println("数値は2の倍数です。");
      } else if (number % 3 == 0) {
        System.out.println("数値は3の倍数です。");
      } else{
        System.out.println("数値は２と３以外の倍数です。");
      }

      /*if文をネストして記述する条件分岐 */
      int stuScore = 80;
      boolean attendance = true;
      if (stuScore >= 70) {
        if (attendance) {
          System.out.println("合格");
        } else {
          System.out.println("欠席により不合格");
        }
      } else {
        System.out.println("不合格");
      }

      int score2 = 70;
      int oddNum = 23;
      int denialNum = 700;
      //60点以上かつ80点未満となるif文を実装
      if (score2 >= 60 && score2 < 80) {
        System.out.println("60点以上かつ80点未満です。");
      }
      //奇数または5の倍数となるif文を実装
      if (oddNum % 2 == 1 || oddNum % 5 == 0) {
        System.out.println("奇数または5の倍数です。");
      }
      //0以上500未満を否定したif文を実装
      if (denialNum >= 0 && denialNum < 500) {
        System.out.println("0以上500未満以外です。");
      }

      int score3 = 59;
      String message = "";
      // if文で実装
      if (score3 >= 50) {
        message = "50点以上です。";
      } else {
        message = "50点未満です。";
      }
      // 三項演算子で実装
      message = score3 >= 50 ? "50点以上です。" : "50点未満です。";
      System.out.println(message);


      int numberS1 = 1;
      //数値が1の場合、2の場合、3の場合の分岐処理をswitch文のbreakを使って実装
      switch (numberS1) {
        case 1:
          System.out.println("数値は1です。");
          break;
        case 2:
          System.out.println("数値は2です。");
          break;
        case 3:
          System.out.println("数値は3です。");
          break;
      }
      //数値が1の場合、2の場合、3の場合の分岐処理をswitch文のbreakを使わずに実装
      switch (numberS1) {
        case 1:
          System.out.println("数値は1です。");
        case 2:
          System.out.println("数値は2です。");
        case 3:
          System.out.println("数値は3です。");
      }

      String subject = "社会";
      int number4 = -1;
      // 問題1. 文字列が「国語」、「数学」、「理科」の場合の分岐処理で「社会」が渡された時のswitch文を実装
      switch (subject) {
        case "国語":
          System.out.println("国語です。");
          break;
        case "数学":
          System.out.println("数学です。");
          break;
        case "理科":
          System.out.println("理科です。");
          break;
        default:
          System.out.println("その他の教科です。");
          break;
      }
      // 問題2. 数値が0、1、2の場合の分岐処理で負の値が式に渡された時のswitch文を実装
      switch (number4) {
        case 0:
          System.out.println("数値は0です。");
          break;
        case 1:
          System.out.println("数値は1です。");
          break;
        case 2:
          System.out.println("数値は2です。");
          break;
        default:
          System.out.println("数値は不正です。");
          break;
      }

      int number5 = 23;
      String message2 = "";
      //正の整数を判定するif文の中で、奇数と偶数を判定するif文を実装
      if (number >= 0){
          if (number % 2 == 1){
              message2 = "奇数です。";
          } else {                    // 内层 else
              message2 = "偶数です。";
          } 
        } else {                      // 注意：这个是外层else
          message2 = "値が不正です。";
        }
        System.out.println(message2);

      //奇数と偶数を判定するif文を三項演算子に書き換えて実装
      message = number % 2 == 1 ? "奇数です。" : "偶数です。";



    }
  }
  