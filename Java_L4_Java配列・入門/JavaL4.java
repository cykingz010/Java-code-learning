public class JavaL4 {
    public static void main(String[] args) {
    /*
    Javaにおける配列の基本的な使い方から多次元配列までの操作を習得します。 
    データセットの効率的な取り扱いを目指します。
    */
    
    //int型の配列intArrayを宣言してください
    int[] intArray;
    //String型の配列strArrayの宣言と要素数3での初期化をまとめて書いてください
    String[] strArray = new String[3];
   
    //配列arraySampleの要素数を出力してください
    int[] arraySample = new int[5];
    System.out.println(arraySample.length);

    //配列numbersの要素に値10、20をそれぞれを代入してください
    int[] numbers = new int[2];
    numbers[0] = 10;
    numbers[1] = 20;
    //String型の配列stringsを宣言し、Red、Greenの要素を指定して初期化してください
    String[] strings = { "Red", "Green" };
    //配列numbersとstringsに代入した値を出力してください
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(strings[0]);
    System.out.println(strings[1]);

    //int型の配列resultNumbersに配列assignNumbersを代入してください
    int[] assignNumbers = { 10, 20 };
    int[] resultNumbers = assignNumbers; // 是否可以认为，新数组抓的是旧数组的内容物（地址）？
    System.out.println(resultNumbers[0]);           
    System.out.println(resultNumbers[1]);
    //代入した配列assignNumbersの要素を書き換えてください
    assignNumbers[0] = 90;
    assignNumbers[1] = 100;
    System.out.println(resultNumbers[0]);
    System.out.println(resultNumbers[1]);

    //配列numbersの要素を繰り返し処理で出力してください
    int[] numbers1 = { 10, 20, 30 };
    for (int i = 0; i < numbers1.length; i++) {
      System.out.println(numbers1[i]);
    }


    //配列　拡張for文
    //拡張for文を使用して、配列の要素の合計値を計算することができます。
    int[] numbers2 = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int num : numbers2) {
        System.out.println("当前sum:" + sum);
        System.out.println("当前num:" + num);
        sum += num;
        System.out.println("sum=sum+num后:" + sum);
    }
    System.out.println("合計値は" + sum + "です");

    //配列weathersの各要素を、変数weatherで取り出して処理する拡張for文を使用して出力してください
    String[] weathers = { "Sunny", "Cloudy", "Rainy", "Windy", "Snowy" };
    for (String weather : weathers) {   //配列weathersの各要素を、変数weather【名字随便取】で取り出して処理する拡張for文が実装できる
      System.out.println(weather);   //【使用的时候直接输出函数】
    }

    //配列numbersの要素をすべて2倍してください
    int[] numbers3 = { 1, 1, 2, 3, 5, 8, 13, 21 };
    for (int i = 0; i < numbers3.length; i++) {         //为啥不能  int[] numbers4 = numbers3 * 2; 
      numbers3[i] *= 2;
    }
    //配列numbersの要素を、変数numberで取り出して処理する拡張for文を使用して出力してください
    for (int number : numbers3) {
      System.out.println(number);
    }

    //int型の2次元配列gridを2行3列で宣言してください
    int[][] grid = new int[2][3];
    //int型の2次元配列scoresに要素80,85と75,95を指定して代入してください
    int[][] scores = { { 80, 85 }, { 75, 95 } };
    

    //2次元配列の要素を繰り返し処理で出力してください
    System.out.println("2次元配列の要素を繰り返し処理で出力してください");
    int[][] score = { { 92, 80, 100 }, { 64, 90, 20 } };
    //2次元配列scoreの要素を繰り返し処理で出力してください
    for (int i = 0; i < score.length; i++) {
      for (int j = 0; j < score[i].length; j++) {       
        //for (int j = 0; j < score.length; j++)  不行吗？
        //不可以，内循环需要比较的不是大数组的长度，是内部的小数组长度，假如大数组长度=2，小数组长度=3 ，那么无法打印完全
        System.out.println(score[i][j] + " ");
      }
    System.out.println();
    }

    //2次元配列の要素取得
    int[][] score2 = {
      { 80, 90, 65, 78, 92 }, // Aクラス
      { 60, 70, 59, 60, 98 }, // Bクラス
      { 72, 80, 49, 72, 89 } // Cクラス
    };
    for (int i = 0; i < score2.length; i++) {
      int result = 0;
      for (int j = 0; j < score2[i].length; j++) {   //上記のfor文にネストして、カウンタ変数をj、配列score[i]の要素数分繰り返し処理を行うfor文を実装
        result += score2[i][j];  //変数resultに配列score[i][j]を加算する処理を実装
        System.out.println( "sum：" + result);
      }
      System.out.println("クラスの平均点: " + result / score2[i].length);//変数resultに配列score[i]の要素数分、割り算して
    }



    }
  }
  