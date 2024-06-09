/*  Javaでのオブジェクト指向プログラミングにおける重要な要素の1つであるカプセル化について学ぶレッスンです。 
パッケージ宣言から各種アクセス修飾子を学び、カプセル化などのプログラミング原則を理解することで、
コードの安全性や保守性を高めつつ、柔軟で効率的なプログラミングが可能になります。 */

package com.codelesson;
// パッケージ宣言を定義してください
import fruit.Apple;
import kingdom.Rose;


class Book {
  //  private修飾子のフィールドを定義してください
  private int price;

  public void displayPrice() {
    // 同クラス内から、定義したフィールドを参照するよう修正してください
    System.out.println(this.price);
  }

  // getterメソッドを定義してください
  public int getPrice() {
    return this.price;
  }

  // setterメソッドを定義してください
  public void setPrice(int price) {
    this.price = price;
  }
}

// 問題 Userクラスを継承できないクラスに修正してください
final class User {}


class Game {
  // 問題. playメソッドを静的メソッドに修正してください
  public static void play() {
    System.out.println("ゲームプレイ中");
  }
}



    public class Java13 {         
      public static void main(String[] args) {
        Apple apple = new Apple();
        //  Mainクラスで`public`修飾子のフィールドを参照してください
        apple.name = "りんご";
        System.out.println(apple.name);

        Rose rose = new Rose();
        rose.printColor();

        Food food = new Food();
        food.price = 100;
        System.out.println(food.price);

        Book book = new Book();
        book.displayPrice(); 

        // Gameクラスの静的メソッドを呼び出そう
        Game.play();
        
        Book1 testBook = new Book1("技術書", 4000);
        // Mainクラスでカプセル化されたクラスを利用してください
        testBook.displayInfo();

        // Mainクラスでカプセル化がされているBook1クラスを利用してください
        Book1 testbook1 = new Book1();
        Book1 testbook2 = new Book1(); //是不是需要重新定义一个setName了 （见Book1.java）
        testbook1.setPrice(320);
        testbook2.setPrice(-100);
        testBook1.setName("ABC");//好像也不行，是不是因为已经setprice过了？
        testbook1.displayInfo();
        testbook2.displayInfo();


        Dog myDog = new Dog();
        myDog.setAge(-10);  //誤った年齢を設定しようとしている
        int dogAge = myDog.getAge(); 
        System.out.println("犬の年齢: " + dogAge);

        IceCream ice = new IceCream("いちご");
        // イミュータブルオブジェクトから、フィールドの値を取得してみよう
        System.out.println(ice.getTopping());

      } 
    }
    
  