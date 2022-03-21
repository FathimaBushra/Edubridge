package patternsassignment;
import java.util.Scanner;
public class Pattern7 {
/*Output:n=5;
*****
*   *
*   *
*   *
*****
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1) || (i==n) || (j==1) || (j==n))
				{
					System.out.print("*");
				}
				else	
					{
						System.out.print(" ");
					}					
			}
			System.out.println();
		    }
	   	scanner.close();
	    }

	}
