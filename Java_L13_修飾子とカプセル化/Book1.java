public class Book1 {

    // アクセス修飾子を修正して、データを隠蔽してください
    private int price;
    private String name;
  
    Book1(String name, int price) {
      this.name = name;
      this.price = price;
    }
  
    // アクセス修飾子を修正して、メソッドを外部へ公開してください
    public void displayInfo() {
      System.out.println(name + "は" + price + "円です。");
    }
  }
  