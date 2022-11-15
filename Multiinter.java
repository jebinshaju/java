interface models
{
  public void displaycars();
}
interface price
{
  public void displayprice();
}

class Cars implements models,price
{
  public void displaycars()
  {
    System.out.println("Car models");
    System.out.println("golf\npassat\njetta\n");
  }
  public void displayprice()
  {
    System.out.println("Car prices");
    System.out.println("Golf - 35000$\npassat - 28000$\njetta - 25000$\n");
  }
}
public class Multiinter
{
  public static void main(String[] args)
  {
    Cars cr = new Cars();
    cr.displaycars();
    cr.displayprice();

  }
}
