/*  Javaでのオブジェクト指向プログラミングにおける重要な要素の1つであるカプセル化について学ぶレッスンです。 
パッケージ宣言から各種アクセス修飾子を学び、カプセル化などのプログラミング原則を理解することで、
コードの安全性や保守性を高めつつ、柔軟で効率的なプログラミングが可能になります。 */

// パッケージ宣言を定義してください
import fruit.Apple;



class Book {
  //  private修飾子のフィールドを定義してください
  private int price;

  public void displayPrice() {
    // 同クラス内から、問題1で定義したフィールドを参照するよう修正してください
    System.out.println(this.price);
  }
}



    public class Java13 {         
      public static void main(String[] args) {
        Apple apple = new Apple();
        // Mainクラスで`public`修飾子のフィールドを参照してください
        apple.name = "りんご";
        System.out.println(apple.name);

        /* Food food = new Food();
        food.price = 100;
        System.out.println(food.price);*/

        Book book = new Book();
        book.displayPrice();
      } 
    }
    
  