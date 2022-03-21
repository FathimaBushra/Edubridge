package patternsassignment;

import java.util.Scanner;

public class Pattern13 {

/*
 Output:
	 
	* 
   *** 
  ***** 
 ******* 
********* 
 ******* 
  ***** 
   *** 
    * 

 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows");

		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			for (int j = n-1; j >=  i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");

			}
			for (int l = i - 1; l >= 1; l--)
			{
				System.out.print("*");

			}
			System.out.println(" ");
		}
		for (int i =n-1; i >= 1; i--) 
		{
			for (int j = n-1; j >=  i; j--) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");

			}
			for (int l = i - 1; l >= 1; l--)
			{
				System.out.print("*");

			}
			System.out.println(" ");
		}
		scanner.close();

	}

}
