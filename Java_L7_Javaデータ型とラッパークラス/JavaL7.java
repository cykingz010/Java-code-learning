public class JavaL7 {
    /* データ型とラッパークラスについて学ぶレッスンです。 
    型のボクシングとアンボクシングを理解し、さまざまなデータ型の変換方法を習得します。 
    型エラーを防ぎながら、型の利点を最大限に活用する方法を学びます。*/


    public static void main(String[] args) {
    
    final int PRIM_INT = 100;
    final double PRIM_DOUBLE = 10.25;
    // Integer.valueOfメソッドを使用して、int型の定数PRIM_INTをInteger型の変数wrapIntに代入してください
    Integer wrapInt = Integer.valueOf(PRIM_INT);
    System.out.println(wrapInt); 
    // Double.valueOfメソッドを使用して、double型の定数PRIM_DOUBLEをDouble型の変数wrapDoubleに代入してください
    Double wrapDouble = Double.valueOf(PRIM_DOUBLE);
    System.out.println(wrapDouble); 
    

    }

  }

  