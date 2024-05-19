public class JavaL1 {
    public static void main(String[] args) {
      /*
      Javaプログラミングの初歩から学びます。 
      基本的な出力方法、データ型、変数の操作を通じて、効率的なコード記述の基礎を築きます。
      */
      
      // 文字列"Hello World"を出力              「//」でコメントを記述
      System.out.println("Hello World");
      // 文字列"Hello! World!"を出力
      System.out.print("Hello! ");
      System.out.print("World!");
      System.out.println();

      /*コメントのルール ：こうやって複数行のコメントを記述 */  
      System.out.println("文字列出力test");    //文字列をターミナル（terminal）に出力
      System.out.println(100);                //数値をターミナル（terminal）に出力
      System.out.println(false);              //真偽値をターミナル（terminal）に出力

      
      String word = "Hello"; //文字列型の変数を宣言
      int number = 100;      //整数型の変数を宣言
      boolean bool = true;   //論理型の変数を宣言
      /*変数をターミナルに出力*/
      System.out.println(word);
      System.out.println(number);
      System.out.println(bool);
      System.out.println(word + number + bool);

      /*nullをターミナルに出力*/
      System.out.println("/*nullをターミナルに出力*/");  
      String nullWord = null;
      System.out.println(nullWord); //直接出力null是不可以的？

      /*変数の値を更新*/ 
      System.out.println("/*変数の値を更新*/");     
      word = "Hi";          //文字列型の変数を更新
      number = 1;          //整数型の変数を更新
      bool = false;          //論理型の変数を更新
      System.out.println(word);
      System.out.println(number);
      System.out.println(bool);

      //finalで定数宣言
      final String MESSAGE = "Good Evening";
      final int MIN_VALUE = 10;
      //定数をターミナルに出力
      System.out.println(MESSAGE);
      System.out.println(MIN_VALUE);

      //足し算を実装
      int sum = 29 + 46;
      System.out.println(sum);
      //引き算を実装
      int difference = 97 - 38;
      System.out.println(difference);
      //掛け算を実装
      int product = 29 * 46;
      System.out.println(product);
      //割り算(商)を実装
      int quotient = 1230 / 6;
      System.out.println(quotient);
      //割り算(余り)を実装
      int remainder = 1334 % 9;
      System.out.println(remainder);

      //複合代入演算子で足し算の結果を代入
      sum += 5;
      System.out.println(sum);
      //複合代入演算子で引き算の結果を代入
      difference -= 5;
      System.out.println(difference);
      

      /*インクリメント・デクリメント*/ 
      int countUp = 10;
      int countDown = 10;
      //インクリメントを実装
      countUp++;
      System.out.println(countUp);
      //デクリメントを実装
      countDown--;
      System.out.println(countDown);


      byte bNum = 127;
      short sNum = 32767;
      int iNum = 2147483647;
      // long lNum = 9223372036854775807; //实际上有点大 会报错

      // 身長（m）
      double height = 1.755;
      // 体重（kg）
      double weight = 65.0;
      // BMIを計算する
      double bmi = weight / (height * height);
      // 出力結果：BMIは21.103724807428513です。
      System.out.println("BMIは" + bmi + "です。");

      /*様々なデータ型*/
      //整数型の値を出力
      int intNum = 123;
      System.out.println(intNum);
      long longNum = 123456789012l;
      System.out.println(longNum);
      //浮動小数点型の値を出力
      float floatNum = 123.45f;
      System.out.println(floatNum);
      double doubleNum = 12345.678;
      System.out.println(doubleNum);

      //String型の値を出力
      String message = "こんにちは";
      System.out.println(message);
      //Integer型の値を出力
      Integer price = 12345;
      System.out.println(price);
      //Double型の値を出力
      Double point = 123.45;
      System.out.println(point);

      /* 型変換(拡大変換,縮小変換) */

      //short型からlong型へ拡大変換して出力
      short shortNumber = 123;
      long longNumber = shortNumber * 10000;
      System.out.println(longNumber);
      //double型からfloat型へ縮小変換して出力
      double dblPoint = 123.25;
      float fltPoint = (float) dblPoint;
      System.out.println(fltPoint);

      //整数値と少数の演算で暗黙的キャストを行う
      int centimeter = 150;
      double meter = centimeter / 100.0;           //double型の変数meterを宣言し、変数centimeterを値100.0で割って代入して
      System.out.println(meter);
      //整数値の割り算で解が小数の明示的キャストを行う
      int distance = 500;
      int time = 120;
      double averageSpeed = (double) distance / time;   //double型の変数averageSpeedを宣言し、変数distanceを変数timeで割って代入して
      System.out.println(averageSpeed);

      //文字列同士を結合
      String name = "佐藤さん";
      String greeting = "こんにちは";
      String message2 = name + "、" + greeting;
      System.out.println(message2);
      //文字列と数値を結合
      String subject = "社会";
      int score = 78;
      String Grades = subject + "：" + score;
      System.out.println(Grades);
      
    }
  }
  