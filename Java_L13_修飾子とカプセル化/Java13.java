/*  Javaでのオブジェクト指向プログラミングにおける重要な要素の1つであるカプセル化について学ぶレッスンです。 
パッケージ宣言から各種アクセス修飾子を学び、カプセル化などのプログラミング原則を理解することで、
コードの安全性や保守性を高めつつ、柔軟で効率的なプログラミングが可能になります。 */

// パッケージ宣言を定義してください
//import fruit.Apple;



class Book {
  //  private修飾子のフィールドを定義してください
  private int price;

  public void displayPrice() {
    // 同クラス内から、問題1で定義したフィールドを参照するよう修正してください
    System.out.println(this.price);
  }
}

class Game {

  // playメソッドを静的メソッドに修正してください
  public static void play() {
    System.out.println("ゲームプレイ中");
  }
}



    public class Java13 {         
      public static void main(String[] args) {
        //Apple apple = new Apple();
        // Mainクラスで`public`修飾子のフィールドを参照してください
        //apple.name = "りんご";
        //System.out.println(apple.name);

        /* Food food = new Food();
        food.price = 100;
        System.out.println(food.price);*/

        /* Book book = new Book();
        book.displayPrice(); */

        // 静的メソッドを呼び出してください
        Game.play();
        
        Book1 book = new Book1("技術書", 4000);
        // Mainクラスでカプセル化されたクラスを利用してください
        book.displayInfo();

        Dog myDog = new Dog();
        myDog.setAge(-10);  //誤った年齢を設定しようとしている
        int dogAge = myDog.getAge(); 
        System.out.println("犬の年齢: " + dogAge);

        IceCream ice = new IceCream("いちご");
        // イミュータブルオブジェクトから、フィールドの値を取得してみよう
        System.out.println(ice.getTopping());

      } 
    }
    
  