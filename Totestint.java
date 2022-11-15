import java.util.*;
interface test
{
  public void square();
}

class Arithemetic implements test
{
  int no;
  public void square()
  {
    int ans = no*no;
    System.out.println("The square is : "+ans);
  }
}

class Totestint
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Arithemetic ar = new Arithemetic();
    System.out.print("Enter the number : ");
    int num = sc.nextInt();
    ar.no=num;
    ar.square();
    
  }
}
