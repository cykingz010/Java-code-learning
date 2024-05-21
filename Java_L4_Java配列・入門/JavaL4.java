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


    

    }
  }
  