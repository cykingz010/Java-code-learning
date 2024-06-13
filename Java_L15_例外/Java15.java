/*  Javaによるシステム開発には欠かせない要素の1つである例外処理について学ぶレッスンです。 
try-catch構文やをthrow-throws構文を学び、システム開発における例外処理のセオリーを身に着けます。 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class Java15 {         
      public static void main(String[] args) {
  /*       int number1 = 10;
        // 例外を発生させてみてください
        int number2 = 0;
        int result1 = number1 / number2;
        System.out.println("Result: " + result1); */
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Java15.main(Java15.java:11)*/

        int number3 = 10;
        int number4 = 0;
        // 例外処理のブロックを記述してください
        // tryブロックで囲む
        try {
          int result2 = number3 / number4;
          System.out.println("Result: " + result2);
        } catch (ArithmeticException e) {
          // catchブロックで囲む
          System.out.println("0で割ることはできません");
        }
        

        System.setErr(System.out);
        int number5 = 10;
        int number6 = 0;
    
        try {
          int result = number5 / number6;
          System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
          // 例外処理として、スタックトレースを表示してください
          e.printStackTrace();
          // 例外処理として、例外発生の原因やメッセージを表示してください
          System.out.println("0で割ることはできません: " + e.getMessage());
        }
      
        System.setErr(System.out);
        int number7 = 10;
        int number8 = 0;
        // 例外処理の有無にかかわらず、必ず実行されるfinallyブロックを記述してください
        try {
          int result = number7 / number8;
          System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
          System.out.println("0で割ることはできません: " + e.getMessage());
          e.printStackTrace();
        } finally {
          // 以下の命令はfinallyブロックで実行されるように囲むこと
          System.out.println("プログラムを終了します。");
        }

          String filePath = "example.txt";
      
          // try-with-resources構文を利用してexample.txtファイルが確実に閉じられるようにしてください
          try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
              System.out.println(scanner.nextLine());
            }
          } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません: " + e.getMessage());
          }
      }


        // divideメソッドで例外発生した時、スローするように修正してください
        private static void divide(int number1, int number2)
        throws ArithmeticException {
        int result = number1 / number2;
        System.out.println("Result: " + result);
      }

    }
    
  