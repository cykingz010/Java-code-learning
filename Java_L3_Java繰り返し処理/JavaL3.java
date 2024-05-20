public class JavaL3 {
    public static void main(String[] args) {
    /*
    繰り返し処理に必要なfor文やwhile文をJavaで実装し、 
    アルゴリズムの効率化を図ることができるようになるコースです。
    */
      
    //for文を使って"Hello World"をコンソールに3回出力して
    for (int i = 0; i < 3; i++) {
      System.out.println("Hello world!");
    }

    int sum = 0;
    //for文を使って1から10まで足し算した値を、コンソールに出力してみよう
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("合計値: " + sum);//出力55

    int sum2 = 0;
    //for文を使って1から10までの偶数のみ足し算し、足し算した値が3の倍数の時のみ”XXは3の倍数です”をコンソールに出力してみよう
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sum2 += i;
        if (sum2 % 3 == 0) {
          System.out.println(sum2 + "は3の倍数です");
        }
      }
    }
    System.out.println("合計値: " + sum2); //出力30

    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for(int i = 0; i < numbers.length; i++){
		    if(numbers[i] < 5){
				  continue;  //5未満の要素は処理をスキップ
		    }
		System.out.println(numbers[i]); //出力： 5、6、7、8、9、10（end）
    }
    
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i); //出力： 1 、 2、 3、 4  （end）
    }

    //for文とcontinue文を使って1から5までの奇数のみコンソール出力してみよう
    for (int i = 1; i <= 5; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println("番号: " + i);
    }
    //5回処理を繰り返すfor文にbreak文を追加し、3回目の処理でループ終了させてみよう
    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        break;  // 3回目の処理でループを終了
      }
      System.out.println("処理: " + i);
    }

    //for文の中にfor文を記述してみよう【for文の多重ループ】
    for (int i = 1; i <= 3; i++) {
      System.out.println("外側のループ: " + i);

      for (int j = 1; j <= 2; j++) {
        System.out.println("内側のループ: " + j);
      }
    }

    /*条件を満たす処理をfor文を使って実装して：
    1から10まで繰り返すfor文の中に、1から5まで繰り返すfor文を記述
    外のループ回数と中のループ回数をかけ算した値をコンソール出力
    かけ算した値が3の倍数の時に3の倍数ですをコンソール出力
    かけ算した値が5の倍数の時に5の倍数ですをコンソール出力
    かけ算した値が3の倍数、かつ5の倍数の時はcontinue文で処理をSKIP（何もコンソール出力しない）*/
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 5; j++) {
        int result = i * j;
        System.out.println("掛け算結果: " + result);

        if (result % 3 == 0 && result % 5 == 0) {
          continue;
        }

        if (result % 3 == 0) {
          System.out.println("3の倍数です");
        }

        if (result % 5 == 0) {
          System.out.println("5の倍数です");
        }
      }
    }


    }
  }
  