/*  Javaでのオブジェクト指向プログラミングにおける重要な要素の1つであるポリモーフィズムについて学ぶレッスンです。 
抽象クラスやインターフェイスを学び、抽象化の原則やポリモーフィズムを理解し、効果的なプログラミングスキルを構築します。 */

// インターフェースを宣言してください
interface Shape {
  // 抽象メソッドを宣言してください
  double calcArea();
}

    public class Java14 {         
      public static void main(String[] args) {
        
        Apple apple = new Apple(100);
        System.out.println("りんごの値段: " + apple.getPrice() + "円");

        Triangle triangle = new Triangle(10, 5);
        System.out.println(triangle.calcArea());

        Admin adminUser = new Admin();
        adminUser.login();

        Dog dog1 = new Dog();
        // アップキャストを行い、DogクラスのインスタンスをAnimal型の変数に代入しよう
        Animal animal = dog1;
        // Animal型の変数に代入されたDogクラスのインスタンスを、ダウンキャストを行い、Dog型の変数に代入しよう
        Dog dog2 = (Dog) animal;

        Dish dish1 = new Pasta(); //实际上没new成功，需要补充一个pasta的类，这里我们写一个继承抽象类的pasta和soup吧
        Dish dish2 = new Soup();
        // メソッドを呼び出すよう修正し、ポリモーフィズムを活用できるようにしてください
        dish1.cook();
        dish2.cook();

        Dish[] dishes = new Dish[2];
        // スーパークラスの型の配列に、サブクラスのインスタンスを代入するよう修正してください
        dishes[0] = new Pasta();
        dishes[1] = new Soup();
        // 問題2. 異なる型のインスタンスを一括で処理するよう修正してください
        for(Dish dish : dishes) {
          dish.cook();
        }

/*         // 問題1. 匿名クラスを宣言するよう修正してください
        Shape circle = new Shape() {
          @Override
          void draw() {
            System.out.println("円を描きます");
          }
        };
        // 問題2. 匿名クラスのメソッドを利用してください
        circle.draw();
 */
      } 
    }
    
  