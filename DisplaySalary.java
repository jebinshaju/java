class Employee
{
  void display()
  {
    System.out.println("Name of the class is Employee.");
  }
  void calcSalary()
  {
    System.out.println("Salary of employee is 10000.");
  }
}
class Engineer extends Employee
{

  void calcSalary()
  {
    System.out.println("Salary of employee is 20000.");
  }
}

public class DisplaySalary
{
  public static void main(String[] args)
  {
    Engineer eng =new Engineer();
    eng.display();
    eng.calcSalary();
    
  }
}
