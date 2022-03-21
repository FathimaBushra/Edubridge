package patternsassignment;
import java.util.Scanner;
public class Pattern11 {
/*o/p:
		*
		**
		***
		****
		*****
		****
		***
		**
		*
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =n-1; i >= 1; i--) 
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
