package com.codelesson;

public class Book1 {

    // アクセス修飾子を修正して、データを隠蔽してください
    private int price;
    private String name;
  
    Book1(String name, int price) {
      this.name = name;
      this.price = price;
    }
  
    public void setPrice(int price) {
      // 価格に0未満の数値が誤って設定されないよう、setPriceメソッドを実装
    }

    public String setName(String name){  //自己写了一个setName
      this.name = name;
      return name;
    }


    // アクセス修飾子を修正して、メソッドを外部へ公開
    public void displayInfo() {
      System.out.println(name + "は" + price + "円です。");
    }

  }
  