import java.util.Scanner;
class Box
{
	double volume(double width,double height,double length)
	{
		double vol=width*height*length;
		return vol;
	}
}
class Paramethodbox
{
	public static void main(String[] args)
	{
		double width,height,length;
		Scanner sc=new Scanner(System.in);
		Box b = new Box();
		System.out.print("Enter the width of the box: ");
		width=sc.nextDouble();
		System.out.print("Enter the height of the box: ");
		height=sc.nextDouble();
		System.out.print("Enter the length of the box: ");
		length=sc.nextDouble();
		System.out.println("The volume of the box = "+b.volume(width,height,length));
		sc.close();
		
	}
}

/*
Enter the width of the box: 10
Enter the height of the box: 10
Enter the length of the box: 10
The volume of the box = 1000.0
*/
