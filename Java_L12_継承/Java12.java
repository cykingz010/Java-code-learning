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
  
  public void callSuper() {
    // Circleクラスからスーパークラスのdescriptionメソッドを呼び出してみよう
    super.description();
  }
}

class Car extends Vehicle {
  public Car() {
    // スーパークラスのコンストラクタを呼び出してください
    super("トヨタの車");
  }
}

    public class Java12 {         
      public static void main(String[] args) {
      // 作成したクラスのインスタンスを生成してください
      Carrot carrot = new Carrot();  //切记new的时候 是要有（）的

      // インスタンスを生成し、定義したメソッドを使用してください
      Circle circle = new Circle();
      circle.getPi();

      circle.callSuper(); //callSuperメソッドを使用
      }
    }
    
  