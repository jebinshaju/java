import java.util.Scanner;
class Box
{
	double width,height,length;
	Box(double w1 ,double h1,double l1)
	{
		width=w1;
		height=h1;
		length=l1;
	}
	double volume()
	{
		double vol=width*height*length;
		return vol;
	}
}
class Volboxconspara
{
	public static void main(String[] args)
	{
		double w,h,l;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the width of the box: ");
		w=sc.nextDouble();
		System.out.print("Enter the height of the box: ");
		h=sc.nextDouble();
		System.out.print("Enter the length of the box: ");
		l=sc.nextDouble();
		Box b = new Box(w,h,l);
		System.out.println("The volume of the box = "+b.volume());
		sc.close();
		
	}
}

/*
Enter the width of the box: 10
Enter the height of the box: 20
Enter the length of the box: 30
The volume of the box = 6000.0
*/
