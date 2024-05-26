public class JavaL5 {
    /* Javaでメソッドを定義し、パラメータ渡しや戻り値の受け取り方を学習します。*/

    //Hello World!をコンソールに出力するメソッドsayHelloを定義して
    public static void sayHello() {
      System.out.println("Hello World!");
    }
    //String型の引数nameを受け取り、nameと「です。」を結合させた自己紹介を出力するメソッドsayNameを定義して
    public static void sayName(String name) {
      System.out.println(name + "です。");
    }

    //int型の引数num1,num2の2つを受け取り、足し算の結果を出力するメソッドaddTwoValuesを定義して
    public static void addTwoValues(int num1, int num2) {
      System.out.println(num1 + num2);
    }

    //int型の引数num1,num2の2つを受け取り、掛け算の結果を出力するメソッドmultiplyTwoValuesを定義して
    public static void multiplyTwoValues(int num1, int num2) {
      System.out.println(num1 * num2);
    }

    //int型の引数num1,num2の2つを受け取り、割り算の結果を出力するメソッドdivideTwoValuesを定義して
    public static void divideTwoValues(int num1, int num2) {
      System.out.println(num1 / num2);
    }

    //String型Helloを返す、引数なしのメソッドgetHelloを定義してく
    public static String getHello() {
      return "Hello";
    }

    //int型の引数numを受け取り、String型変数resultMessageを宣言、三項演算子で偶数判定し、
    //「偶数です。」と「奇数です。」の何れかの文字列を代入して、返却するメソッドevenOddDecisionを定義して
    public static String evenOddDecision(int num) {
      String resultMessage = "";  //String型変数resultMessageを宣言
      resultMessage = num % 2 == 0 ? "偶数です。" : "奇数です。"; //三項演算子で偶数判定し
      return resultMessage;
    }

    // int型の可変長引数numbersを受け取り、足し算の結果を格納する変数addNumに初期値0を代入し、
    // 拡張for文で変数numを定義して足し算を行い、最後足し算の結果を出力するメソッドgetAdditionを定義して
    public static void getAddition(int... numbers) {
      int addNum = 0;
      for (int num : numbers) {
        addNum += num;
      }
      System.out.println(addNum);
    }

    // int型の可変長引数scoresを受け取り、足し算の結果を格納する変数addNumを定義し、
    // 拡張for文で変数scoreを定義して足し算を行い、平均点をscoresの要素数で計算して返却するメソッドgetAverageを定義して
    public static int getAverage(int... scores) {  // int 后面跟着的是实际参数？
      int addNum = 0; 
      for (int score : scores) {  //那这里的score又是做什么的呢？ 拡張for文で変数score 这个形容有点怪怪的
        addNum += score;
      }
      return addNum / scores.length;
    }

    public static void main(String[] args) {
      //定義したメソッドsayHelloを実行して
      sayHello();

      //メソッドsayNameの引数に「山田太郎」や「山田花子」を渡して実行して
      sayName("山田太郎");
      sayName("山田花子");

      //メソッドaddTwoValuesに引数81,9や1257,23を渡して実行して
      addTwoValues(81, 9);
      addTwoValues(1257, 23);

      //メソッドaddTwoValuesに引数81,9、メソッドdivideTwoValuesに引数1257,23を渡して実行して
      multiplyTwoValues(81, 9);
      divideTwoValues(1257, 23);

      //定義したメソッドgetHelloを実行し、返ってきた値とWorldを文字列結合して出力して
      System.out.println(getHello() + "World");
      
      //定義したメソッドを使って「問題2: 」と「偶数です。」を結合して出力して
      System.out.println("問題2: " + evenOddDecision(54));

      //定義したメソッドを使って「問題3: 」と「奇数です。」を結合して出力して
      System.out.println("問題3: " + evenOddDecision(21));

      // 定義したメソッドgetAdditionの引数に1,2,3,4を渡して実行し、続いて5,6,7,8,9,10を渡して実行して
      getAddition(1, 2, 3, 4);
      getAddition(5, 6, 7, 8, 9, 10);

      // 定義したメソッドgetAverageの引数に「60、80」を渡して「山田太郎: 」の後に結合して文字列を出力し、
      // 続いて「80、70、90」を渡して「山田花子: 」の後に結合して文字列を出力して
      System.out.println("山田太郎: " + getAverage(60, 80));
      System.out.println("山田花子: " + getAverage(80, 70, 90));

    }
  }

  