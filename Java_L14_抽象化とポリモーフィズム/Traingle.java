// TriangleクラスがインターフェースShapeを実装するように宣言してみよう
//問題1. インターフェースを実装したクラスを宣言してください
class Triangle implements Shape {

    private double height;
    private double width;
  
    public Triangle(double height, double width) {       //这个是实例化？
      this.height = height;
      this.width = width;
    }
  
    // 問題2. インターフェースで宣言された抽象メソッドを実装してください
    //ShapeクラスのcalcArea()メソッドを実装してみよう
    public double calcArea() {    //接口里定义的抽象方法，要在这里详细定义完？
      return (height * width) / 2.0;
    }
  }
  