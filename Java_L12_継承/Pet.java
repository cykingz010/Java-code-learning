/**
 * 動物クラス
 */
public class Pet {

    public String name;
    /**
     * 名前を出力し、新インスタンスを作成します。
     *
     * @param name 名前
     */
    public Pet(String name) {
        this.name = name;
      System.out.println(name + "が誕生しました。");
      
    }
  
    /**
     * 歩くを出力します。
     */
    public void walk(String name) {
        this.name = name;
      System.out.println(name + "歩く");
    }
  }
  