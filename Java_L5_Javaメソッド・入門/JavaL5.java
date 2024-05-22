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
    }



  }

  