import java.io.*;
import java.util.*;
public class Filecount
{
  public static void main(String[] args)throws IOException
  {
    int lcount=0,ccount =0,wcount=0;
    
    System.out.println("Program to count line,word and characters\n");
    FileWriter fw= new FileWriter("hello.txt");
    String s = "Aliens are comming.\nhai kutta";
    fw.write(s);
    fw.close();
    
    File f = new File("hello.txt");
    Scanner sc0= new Scanner(f);
    Scanner sc1= new Scanner(f);
    Scanner sc2= new Scanner(f);

    while(sc0.hasNextLine())
    {
        lcount++;
        System.out.println(sc0.nextLine());
        
    }

    while(sc1.hasNextLine())
    {
        String e = sc1.nextLine();
        for (String s2 : e.split("")) 
        {
            if(s2.equals(" "))
            {  
            } 
            else
            {
                ccount++;
              
            }
        }
    }

    while (sc2.hasNext())
    {
        wcount++; 
        sc2.next();
    }

    System.out.println("\nWord count = "+ wcount);
    System.out.println("Char count = "+ ccount);
    System.out.println("Line count = "+ lcount);
    sc0.close();
    sc1.close();
    sc2.close();
  }
}
