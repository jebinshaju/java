abstract class Shapes
{
  public abstract void numberOfSides();
}

class Rectangle extends Shapes
{
  public void numberOfSides()
  {
    System.out.println("Number of sides of rectangle is 4.");
  }
}

class Hexagon extends Shapes
{
  public void numberOfSides()
  {
    System.out.println("Number of sides of hexagon is 6.");
  }
}

class Triangle extends Shapes
{
  public void numberOfSides()
  {
    System.out.println("Number of sides of triangle is 3.");
  }
}

public class Sides
{
  public static void main(String[] args)
  {
    Rectangle rec = new Rectangle();
    Hexagon hex = new Hexagon();
    Triangle tri = new Triangle();
    
    System.out.println("Program to implement abstraction in java.\n");
    rec.numberOfSides();
    hex.numberOfSides();
    tri.numberOfSides();
    
  }
}
























