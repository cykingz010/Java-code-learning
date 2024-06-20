/* Javaでのラムダ式について学ぶレッスンです。 
関数型インターフェイスや、ラムダ式の文法、ストリームAPIを学び、Javaにおける関数型プログラミングのスキルを習得します。 */

public class JavaL17 {
    public static void main(String[] args) {

      /* ラムダ式(基本文法) */

      // 問題1. ラムダ式を記述してください
      FunctionSample sample = (a,b) -> {
        int answer = a + b;
        return answer;
      };             //注意这里需要加一个分号
  
      // 問題2. ラムダ式を実行してください
      // int number = System.out.println(number);
      int number = sample.calc(10, 5);
      System.out.println(number);



      /* ラムダ式(基本の使い方) */

      FunctionSample sample1 = (a, b) -> {
        // 問題1. ラムダ式の処理部が加算処理になるようにコードを修正してください
        int answer = a + b;
        return answer;
      };
      FunctionSample sample2 = (a, b) -> {
        // 問題2. ラムダ式の処理部が減算処理になるようにコードを修正してください
        int answer = a - b;
        return answer;
      };
  
      // 問題3. ラムダ式を利用し、引数が同じだが処理結果が異なるメソッド呼出を実装してください
      int number1 = sample1.calc(10, 5);
      int number2 = sample2.calc(10, 5);
  
      System.out.println(number1);
      System.out.println(number2);


      /*  */
      int c = 10;

      FunctionSample sample3 = (a, b) -> {
        // 問題1. ラムダ式ではエラーとなる、変数への再代入処理をコメントアウトしてください
        // c = 100;
        // 問題2. ラムダ式の処理を、ブロックの外側の変数を利用した加算処理に修正してください
        int answer = a + b + c;
        return answer;
      };
  
      int number3 = sample3.calc(10, 5);
      System.out.println(number3);

    }
}