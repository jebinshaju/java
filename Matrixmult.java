import java.util.Scanner;

public class Matrixmult
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int i,j,m1,n1,m2,n2,sum,k;
		int[][] mat1 = new int[5][5];
		int[][] mat2 = new int[5][5];
		int[][] matmul = new int[5][5];
	
		System.out.print("\nEnter the row size of first matrix: ");
		m1=in.nextInt();
		System.out.print("Enter the column size of first matrix: ");
		n1=in.nextInt();
		System.out.println("Enter the matrix.");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the element["+i+"]["+j+"]: ");
				mat1[i][j]=in.nextInt();
			}
		}
		System.out.println("\nThe first matrix.\n");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(mat1[i][j]+"  ");
				
			}
			System.out.println();
		}
		
		System.out.print("\nEnter the row size of second matrix: ");
		m2=in.nextInt();
		System.out.print("Enter the column size of second matrix: ");
		n2=in.nextInt();
		System.out.println("Enter the matrix.");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print("Enter the element["+i+"]["+j+"]: ");
				mat2[i][j]=in.nextInt();
			}
		}
		System.out.println("\nThe second matrix.\n");
		for(i=0;i<m1;i++)
		{
			for(j=0;j<n1;j++)
			{
				System.out.print(mat2[i][j]+"  ");
				
			}
			System.out.println();
		}
		
			if(n1!=m2)
			{
				System.out.println("Number of columns of 1st matrix and number of rows of 2nd matrix should be same\n");
				
			}
			else
			{
			
				for(i=0;i<m1;i++)
				{
					for(j=0;j<n2;j++)
					{
						sum=0;
						for(k=0;k<m2;k++)
						{
							sum=sum+mat1[i][k]*mat2[k][j];
						}
						matmul[i][j]=sum;
					}
				}
				
				System.out.println("\nMATRIX PRODUCT\n");
				for(i=0;i<m1;i++)
				{
					for(j=0;j<n2;j++)
					{
						System.out.print(matmul[i][j]+"  ");
					}
					System.out.println();
				}
			}
		}
	}
	
/*

Enter the row size of first matrix: 3
Enter the column size of first matrix: 3
Enter the matrix.
Enter the element[0][0]: 1
Enter the element[0][1]: 2
Enter the element[0][2]: 3
Enter the element[1][0]: 4
Enter the element[1][1]: 5
Enter the element[1][2]: 6
Enter the element[2][0]: 7
Enter the element[2][1]: 8
Enter the element[2][2]: 9

The first matrix.

1  2  3  
4  5  6  
7  8  9  

Enter the row size of second matrix: 3
Enter the column size of second matrix: 3
Enter the matrix.
Enter the element[0][0]: 9
Enter the element[0][1]: 8
Enter the element[0][2]: 7
Enter the element[1][0]: 6
Enter the element[1][1]: 5 
Enter the element[1][2]: 4
Enter the element[2][0]: 3
Enter the element[2][1]: 2
Enter the element[2][2]: 1

The second matrix.

9  8  7  
6  5  4  
3  2  1  

MATRIX PRODUCT

30  24  18  
84  69  54  
138  114  90 
*/

