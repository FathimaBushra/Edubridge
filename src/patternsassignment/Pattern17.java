package patternsassignment;
//import java.util.Scanner;

public class Pattern17 {
	/*
	 Pattern17
	 
555555555 
544444445 
543333345 
543222345
543212345 
543222345 
543333345
544444445 
555555555

	 */
	public static void main(String[] args) {

		// Scanner scanner=new Scanner(System.in);
		// System.out.println("Enter a number : ");
		// int n=scanner.nextInt();
		//
		for (int i = 5; i >= 1; i--)
		{
			for (int j = 5; j >= 1; j--)
			{

				if (j >= i) 
				{
					System.out.print(j);
				} 
				else
				{
					System.out.print(i);
				}
			}
			for (int k = 2; k <= 5; k++) {
				if (k <= i) 
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {

				if (j >= i) {
					System.out.print(j);
				} else {
					System.out.print(i);
				}
			}
			for (int k = 2; k <= 5; k++) {
				if (k <= i) {
					System.out.print(i);
				} else {
					System.out.print(k);
				}
			}
			System.out.println();
		}

	}

}
