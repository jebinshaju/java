import java.util.Scanner;
class Box
{
	double width,height,length;
	Box()
	{
		width=10;
		height=20;
		length=30;
	}
	double volume()
	{
		double vol=width*height*length;
		return vol;
	}
}
class Volboxcons
{
	public static void main(String[] args)
	{		
		Box b = new Box();
		System.out.println("width of the box is given  10.");		
		System.out.println("height of the boxis given 20. ");		
		System.out.println("length of the box is given 30. ");
		System.out.println("The volume of the box = "+b.volume());
	}
}

/*
width of the box is given  10.
height of the boxis given 20. 
length of the box is given 30. 
The volume of the box = 6000.0
*/
