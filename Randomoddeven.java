//Multithreading in java

import java.util.*;
class RandomThread extends Thread
 {
 	public void run()
 	{
 		Random r= new Random();
 		for(int i = 0 ;i<10;i++)
 		{
 			int n= r.nextInt(100);
 			if(n%2==0)
 			{
 				new Even(n).start();
 			}
 			else{
 			
 				new Odd(n).start();
 			}
 		}
 	}
 	
 }
class Even extends Thread
 {
 	private int num;
 	public Even(int num)
 	{
 		this.num=num;
 	} 
 	public void run()
 	{
 		
 		System.out.println("The square of "+num+" is = "+num*num);
 	}
 }
 
class Odd extends Thread
 {
 	private int num;
 	public Odd(int num)
 	{
 		this.num=num;
 	} 
 	public void run()
 	{
 	
 		System.out.println("The cube of "+num+" is = "+num*num*num);
 	}
 }
 
 public class Randomoddeven
 {
 	public static void main(String[] args)
 	{
 		RandomThread rt =new RandomThread();
 		rt.start();
 	}
 }
 
 /*
 The cube of 37 is = 50653
The cube of 91 is = 753571
The square of 90 is = 8100
The square of 36 is = 1296
The square of 72 is = 5184
The cube of 57 is = 185193
The cube of 23 is = 12167
The square of 92 is = 8464
The cube of 27 is = 19683
The square of 6 is = 36
*/
