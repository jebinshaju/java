import java.io.*;
public class Filehand
{
  public static void main(String[] args)throws IOException
  {
    int i;
    System.out.println("Program to implement File handling.\n");
    FileWriter fw= new FileWriter("hello.txt");
    String s = "Aliens are comming.";
    fw.write(s);
    fw.close();
    
    FileReader fr = new FileReader("hello.txt");
    while((i=fr.read()) != -1)
    {
      
        System.out.print((char)i);
      
    }
    fr.close();
  }
}
