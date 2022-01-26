package patternsassignment;
import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			1	2	3	4	5	
	        16	17	18	19	6	
	        15	24	25	20	7	
	        14	23	22	21	8	
	        13	12	11	10	9
	*/
		
			// create object.
			Scanner sc = new Scanner(System.in);

			// enter the number of elements.
			System.out.print("Enter the number of elements for pattern : ");
			int n = sc.nextInt();
			
			int A[][] = new int[n][n];
			int k=1, c1=0, c2=n-1, r1=0, r2=n-1;

			while(k<=n*n)
			{
				for(int i=c1;i<=c2;i++)
				{
					A[r1][i]=k++;
				}

				for(int j=r1+1;j<=r2;j++)
				{
					A[j][c2]=k++;
				}

				for(int i=c2-1;i>=c1;i--)
				{
					A[r2][i]=k++;
				}

				for(int j=r2-1;j>=r1+1;j--)
				{
					A[j][c1]=k++;
				}
				
				c1++;
				c2--;
				r1++;
				r2--;
			}
			sc.close();
			/* Printing the Spiral pattern */
			System.out.println("The Spiral pattern is : ");
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(A[i][j]+ "\t");
				}
				System.out.println();
			}
		}
	

	}


