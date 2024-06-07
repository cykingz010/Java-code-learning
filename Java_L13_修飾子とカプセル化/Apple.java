//package fruit;

/* public class Apple {
  // public修飾子のフィールド定義をしてください
  public String name;

}
 */

 class Apple extends Fruit {

  Apple(int price) {
    this.price = price;
  }

  // 問題3. 具象クラスのメソッドを定義してください
  @Override
  int getPrice() {
    return price;
  }
}
