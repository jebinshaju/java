import java.util.Scanner;
class Box
{
	double width,height,length;
	
	double volume()
	{
		double vol=width*height*length;
		return vol;
	}
}
class Volboxmethod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Box b = new Box();
		System.out.print("Enter the width of the box: ");
		b.width=sc.nextDouble();
		System.out.print("Enter the height of the box: ");
		b.height=sc.nextDouble();
		System.out.print("Enter the length of the box: ");
		b.length=sc.nextDouble();
		System.out.println("The volume of the box = "+b.volume());
		sc.close();
		
	}
}

/*
Enter the width of the box: 10
Enter the height of the box: 10
Enter the length of the box: 10
The volume of the box = 1000.0
*/

