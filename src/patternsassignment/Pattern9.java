package patternsassignment;
import java.util.Scanner;
public class Pattern9 {
	
/*Output:n=5;
    *
   ***
  *****
 *******
*********
	
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n-i; j++) 
			{

				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
