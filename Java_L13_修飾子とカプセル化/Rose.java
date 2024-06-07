//package kingdom;

public class Rose extends Plant {

  public void printColor() {
    // 問題2. サブクラスRoseクラスにて、問題1で定義したフィールドを参照してください
    // この下に解答してください
    super.color = "赤";
    System.out.println(this.color);
  }
}
