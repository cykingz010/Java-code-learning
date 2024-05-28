/*  Javaでのオブジェクト指向プログラミングにおけるクラス設計の基礎を学ぶレッスンです。 
クラスの作成、メンバフィールドやメソッドの定義方法から、オブジェクト間の関係性を理解し、クラス図の読み解き方を習得します。 */

// SimpleClassクラスを宣言してください
class SimpleClass {
  
}

class Student {
  // StudentクラスにString型のメンバーフィールドnameを宣言してください
  String name = "John";
}

class Employee {
  // String型のメンバーフィールドnameに John を代入し、int型のメンバフィールドageに 20 を代入してください
  String name = "John";
  int age = 20;
}

class Restaurant {
  private String food = "Meat";
  // メンバフィールドfoodをthisを使用して取得して返す、メンバメソッドgetFoodを定義してください
  public String getFood() {
    return this.food;
  }
}

class TaxCalculator {   //这个很关键，一定要搞清楚

  private double taxRate = 0.1;  //常态的0.1税率 （10%）

  // TaxCalculatorクラスにcalculateWithTaxメソッドを定義してください
  public double calculateWithTax(double amount) {
    // calculateWithTaxメソッドを実装してください
    double tax = amount * this.taxRate;  //税=税前amount *（1+tax），
    //但是这里的 this.taxRate是为了什么呢？是为了 double amount使用 上面常态的税率？
    return amount + tax;  //方法的返回值，返回的是含税总价
  }
}

    public class Java10 {         //似乎编译的时候，根据public class 的名称，java文件也会变成相关的文件，否则会报错：找不到主类 xxx
      public static void main(String[] args) {
        // 作成したSimpleClassクラスのインスタンスを生成してください
        SimpleClass simpleObject = new SimpleClass();

        
        // studentオブジェクトのnameの値を出力してください
        Student student = new Student();
        System.out.println(student.name);
        // studentオブジェクトのnameの値を Mike に変更して、出力してください
        student.name = "Mike";
        System.out.println(student.name);


        // employeeオブジェクトのnameの値を取得し、出力してください
        Employee employee = new Employee();
        System.out.println(employee.name);
        // employeeオブジェクトのageの値を23に設定し、出力してください
        employee.age = 23;
        System.out.println(employee.age);


        // restaurantオブジェクトのgetFoodメソッドを使って、メンバフィールドを取得し、出力してください
        Restaurant restaurant = new Restaurant();
        System.out.println(restaurant.getFood());


        // calculateWithTaxメソッドを実行してください
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculateWithTax(100)); //这里用的是 对象.方法（参数）

      }
    }
    
  