package en.stqa.pft.sandbox;

public class test {

  public static void main(String[] args) {
    hello("world");
    hello("Alex");
    hello("user");
    Square s = new Square(8);


    System.out.println("Square area with the side " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(10, 4);

    System.out.println("Rectangle area with the sides " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }




}

