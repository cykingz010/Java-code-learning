/*  Javaでのオブジェクト指向プログラミングにおける重要な要素の1つである継承について学ぶレッスンです。 
スーパークラスとサブクラスの作成、オーバーライドやオーバーロードのメソッド定義方法から、
継承におけるクラスの関係性を理解し、柔軟で再利用可能なコードの作成を目指します。 */


// Vegetableクラスを継承して新しいクラスCarrotを作成してください
class Carrot extends Vegetable{

}

// サブクラスに独自のメソッドを定義してください，クラスに戻り値はvoid，引数なしのメソッドを定義しよう
class Circle extends Shape {
  void getPi() {
    System.out.println("円周率は3.14です。");

  }
  // スーパークラスのメソッドをオーバーライドしてみよう
  @Override
  public void description() {
  System.out.println("円についてのクラスです。");
}
  
  public void callSuper() {
    // Circleクラスからスーパークラスのdescriptionメソッドを呼び出してみよう
    super.description();
  }
}

class Car extends Vehicle {
  public Car() {
    // Carクラスのコンストラクタでスーパークラスのコンストラクタに"トヨタの車"を渡して呼び出してみよう
    super("トヨタの車");  
  }
}

/**
 * 犬クラス 動物クラスを拡張し、新しい機能を追加します。
 * Petクラスを継承したDogクラスに新たなメソッドを追加しましょう
 * @see Pet
 */
class Dog extends Pet {

  public Dog(String name) {   //子类Dog的结构体？
    // Dogクラスでスーパークラスのコンストラクタの引数に"ポチ"を渡して呼び出してみよう
    super("ポチ");    
    
  }

  // サブクラスにメソッドを定義してください  子类的方法
  void walkAndBark() {
    super.walk(super.name); //super.メソッド名でスーパークラスのメソッドを呼び出しましょう
    System.out.println(name + "吠える"); //"吠える"と出力しよう
  }

  // スーパークラスのメソッドをオーバーライドしてみよう
  @Override
  public void introduction(String name) {
    System.out.println("犬の" + name + "です。");
  }

  // メソッドをオーバーロードしてみよう
  public void introduction(String name, int age) {
    System.out.println("犬の" + name + "です。" + age + "才になります。");
  }

}


class Calculator {
  public void add(int a, int b) {
    System.out.println(a + b);
  }

  // addメソッドをオーバーロードして、引数intをdoubleに変え、処理内容は同一の同名クラスを定義してください
  public void add(double a, double b) {
    System.out.println(a + b);
  }
}

    public class Java12 {         
      public static void main(String[] args) {
      // 作成したクラスのインスタンスを生成してください
      Carrot carrot = new Carrot();  //切记new的时候 是要有（）的

      // インスタンスを生成し、定義したメソッドを使用してください
      Circle circle = new Circle();
      circle.getPi();
      circle.description();

      circle.callSuper(); //callSuperメソッドを使用

      // 作成したクラスCarのインスタンスcarを生成してください
      Car car = new Car();

      // インスタンスを生成し、定義したメソッドを使用してください
      Dog dog = new Dog("ポチ"); //为啥这里不需要加"ポチ" —— Dog类的（）里没设置引数？
      dog.walkAndBark();    
      //如果，如果这里我想让walk函数输出 name+歩く，那我需要在pet.java里 public void walk(String name) {}
      //但这样的话，super.walk();就必须加上name了吧，必须加上super.walk(“ポチ”);
      dog.introduction("ポチ");
      dog.introduction("ポチ", 2);

      // インスタンスを生成し、定義したメソッドを使用してください
      Calculator calculator = new Calculator();
      calculator.add(589, 230);
      calculator.add(23.5, 52.8);

      }
    }
    
  