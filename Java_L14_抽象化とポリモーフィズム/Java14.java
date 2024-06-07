/*  Javaでのオブジェクト指向プログラミングにおける重要な要素の1つであるポリモーフィズムについて学ぶレッスンです。 
抽象クラスやインターフェイスを学び、抽象化の原則やポリモーフィズムを理解し、効果的なプログラミングスキルを構築します。 */

// インターフェースを宣言してください
interface Shape {
  // 抽象メソッドを宣言してください
  double calcArea();
}

    public class Java14 {         
      public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        System.out.println(triangle.calcArea());

        Admin adminUser = new Admin();
        adminUser.login();


        Dog dog1 = new Dog();
        // 問題1. サブクラスのインスタンスをアップキャストするよう修正してください
        Animal animal = dog1;
        // 問題2. サブクラスのインスタンスをダウンキャストするよう修正してください
        Dog dog2 = (Dog) animal;
      } 
    }
    
  