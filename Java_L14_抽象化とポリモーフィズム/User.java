interface User {
    // 問題1. loginメソッドをdefaultメソッドに修正してください
    default void login() {
      System.out.println("ログインしました");
    }
  }
  