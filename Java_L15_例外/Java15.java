/*  Javaによるシステム開発には欠かせない要素の1つである例外処理について学ぶレッスンです。 
try-catch構文やをthrow-throws構文を学び、システム開発における例外処理のセオリーを身に着けます。 */


    public class Java15 {         
      public static void main(String[] args) {
        int number1 = 10;
        // 問題1. 例外を発生させてみてください
        int number2 = 0;
        int result1 = number1 / number2;
        System.out.println("Result: " + result1);
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Java15.main(Java15.java:11)*/

        int number3 = 10;
        int number4 = 0;
        // 問題2. 例外処理のブロックを記述してください
        // tryブロックで囲む
        try {
          int result2 = number3 / number4;
          System.out.println("Result: " + result2);
        } catch (ArithmeticException e) {
          // catchブロックで囲む
          System.out.println("0で割ることはできません");
        }
        
      } 
    }
    
  