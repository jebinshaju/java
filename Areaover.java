import java.util.Scanner;
class Shapes
{
	double area(double width,double length)
	{
		double area=width*length;
		return area;
	}
	double area(double radius)
	{
		double area=3.14*radius*radius;
		return area;
	}
	double area(double p,double q,double r)
	{
		double s=(p+q+r)/2;
		double area=Math.sqrt(s*(s-p)*(s-q)*(s-r));
		return area;
	}
}
class Areaover
{
	public static void main(String[] args)
	{
		double width,height,length;
		Scanner sc=new Scanner(System.in);
		Shapes b = new Shapes();
		while(true)
		{
			System.out.print("Options\n1-Area of circle\n2-Area of rectangle\n3-Area of triangle\n0-exit\n\nEnter your option:: ");
			int op=sc.nextInt();
			if(op==1)
			{
				System.out.print("Enter the radius of the circle: ");
				double r=sc.nextDouble();
				System.out.println("The area is = "+b.area(r));
			}
			else if(op==2)
			{
				System.out.print("Enter the height of the rectangle: ");
				double h=sc.nextDouble();
				System.out.print("Enter the length of the rectangle: ");
				double l=sc.nextDouble();
				System.out.println("The area is = "+b.area(h,l));
			}
			else if(op==3)
			{
				System.out.print("Enter the length side1 of the triangle: ");
				double s1=sc.nextDouble();
				System.out.print("Enter the length side2 of the triangle: ");
				double s2=sc.nextDouble();
				System.out.print("Enter the length side3 of the triangle: ");
				double s3=sc.nextDouble();
				System.out.println("The area is = "+b.area(s1,s2,s3));
			}
			else if(op==0)
			{
				System.exit(1);
			}
			else
			{
				System.out.println("Enter a valid option.");
			}
		
		}
	}
}

/*
Options
1-Area of circle
2-Area of rectangle
3-Area of triangle
0-exit

Enter your option:: 1
Enter the radius of the circle: 23
The area is = 1661.06
Options
1-Area of circle
2-Area of rectangle
3-Area of triangle
0-exit

Enter your option:: 2
Enter the height of the rectangle: 10
Enter the length of the rectangle: 10
The area is = 100.0
Options
1-Area of circle
2-Area of rectangle
3-Area of triangle
0-exit

Enter your option:: 3
Enter the length side1 of the triangle: 2
Enter the length side2 of the triangle: 3
Enter the length side3 of the triangle: 4
The area is = 2.9047375096555625

Options
1-Area of circle
2-Area of rectangle
3-Area of triangle
0-exit

Enter your option:: 0

*/
