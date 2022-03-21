package patternsassignment;
import java.util.Scanner;
public class Pattern3 {
/*	
	Output:
		
	*
	**
	***
	****
	*****
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++) 
			{

				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();

	}
	}


