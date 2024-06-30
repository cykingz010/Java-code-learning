// 問題1. ジェネリックメソッドの宣言を記述してください
public class Cart <T> {

    // アイテム
    private T item;
  
    /**
     * コンストラクタ
     *
     * @param item カートに格納するアイテム
     */
    public Cart(T item) {
      this.item = item;
    }
  
    /**
     * カートに格納されているアイテムを取得します。
     *
     * @return カートに格納されているアイテム
     */
    public T getItem() {
      return item;
    }
  }
  