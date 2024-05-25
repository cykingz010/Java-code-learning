public class JavaL_Oracle2 {

    public static void main(String[] args) {

      int array = new int[10];
      // 声明空数组两种写法 
      // int[] a = new int[0];   必须要有数字不能为空
      // int[] b = new int[]{ };

      System.out.println(array);  // 错误的，java不能用print 打印数组
     //方法System.out.println()通过调用String.valueOf()把入参对象转换为一个字符串。 
     //如果我们查看  String.valueOf()  方法的实现，会看到如下的代码：
     // return (obj == null) ? "null" : obj.toString();
     
     int[] a;  //数组正常写法  []在数据类型后面
     int b[];  //b[]看上去是一个变量名   不过C语言里，数组就是这么定义的 int a[]，所以这种写法也是对的
     int [][]c; //正常写法 
     int d[][]; //和int b[][]一个样子 也是对的
     int[] e[];  // 其实是 int[][] e 或者 int e[][]
     int[][] f[];  //其实是 int[][][]f   或者int f[][][]
 
      String[] array = {"A","B","C","D"};
     array[0] = null;        // 因为 A = null , 所以之后输出的时候 Null  B  C  D
     for (String str : array){
       System.out.println(str);
     } 
 
 
     int []d;
     d = new int[]{2,3}; 
     int e[];
     e = {2,3}; //NEW都没有
 
     int a = 11;
     int b = 0;
     while (b<5) {
       if (5 < a){
         System.out.println(b);
       }
       a--;
       b++;
     } 
 
     int a = 0;
     while (a<5) {
       do{
         a++;
         System.out.println(a);
       }while(true);      //do while文は、指定した条件式がtrueの場合に、ブロック内の処理を実行し 
       // 内层do-while循环首先执行循环体，然后检查条件。由于条件为true，内层循环会无限次地执行。
       //循环的条件是永远为true，没有任何退出条件，这意味着一旦进入内层循环，就会一直在内层循环中不断执行
     
 
       
     int array[][] = new int[][]{{1,2},{2,3,4}};    //二维数组的定义和初始化：
     int total = 0;
     for (int i = 0; i < array.length; i++){        //外层循环遍历数组的每一行。
       for (int j = i; j< array[i].length; j++){    //内层循环遍历每一行的部分元素。
         //关键在于j = i，即内层循环的起始索引是外层循环的索引i。array[i].length返回当前行的元素个数。
         //System.out.println("total:" + total);
         total += array[i][j];
         //System.out.println("taotal加算:" +total);
         // j=i=0  tatal[0][0] = 1;
         // j=1,  total[0][1] = 2;  j=2所以内循环结束，去外循环
         // i=1 , 1 < 2 【array长度=2】 , 进内循环
         // j=i=1 1<3 【这里不一样了！！ j < array[1]=3】  total[1][1]=3;
         // j=2 ， 2<3 ， total[1][2]=4;
 
       }
     }

    int total = 0;
    a: for (int i= 0;i< 5; i++) {
        b : for (int j= 0; j< 5; j++) {
            if (i %2 == 0) continue a;  //如果 i 是偶数，则跳过标签为 a 的外层循环的剩余部分，并继续下一个外层循环迭代
            if (3 < j) break b;  //如果 j 大于 3，则跳出标签为 b 的内层循环。
            total += j;  //在内层循环中，只有在满足条件的情况下才会将 j 的值添加到 total 中。
        }
      }
      System.out.printin(total);
      // i=0, 0%2==0，那么b就不继续了，继续做a循环（i++）
      // i=1 total= 0+j =1 ， j++ ， j=2
      // i=1 total= 1+2 = 3  j++ j=3
      // i=1 total=3+3=6   j++ j=4
      //i=1 j=4>3  b循环中断结束 返回a循环, a循环执行结束了，i++   i=2
      // i=2, 2%2==0  不做了 i=3
      //i=3 3%2==1 ，做内循环，继续加6total =12
      //i=4 不做  i++ i=5,
      //循环结束
    


  }

  