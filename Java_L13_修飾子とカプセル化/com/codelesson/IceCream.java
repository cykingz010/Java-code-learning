package com.codelesson;
public final class IceCream {

  // 問題1. イミュータブルな設計のクラスを定義してみよう
  private final String topping;

  IceCream(String topping) {
    this.topping = topping;
  }

  String getTopping() {
    return topping;
  }
}
