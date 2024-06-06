public final class IceCream {

    // イミュータブルな設計のクラスを定義してみよう
    // この下に解答してください
    private final String topping;
  
    IceCream(String topping) {  //这个应该是实例化了吧
      this.topping = topping;
    }
  
    String getTopping() {
      return topping;
    }
  }
  