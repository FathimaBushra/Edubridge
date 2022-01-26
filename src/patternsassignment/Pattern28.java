package patternsassignment;
import java.util.Scanner;
public class Pattern28 {
/* 		if n=6
			o/p:
				1 2 3 4 5 6
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		

		for (int i = 1; i <= n; i++) 
		{
			
			System.out.print(i+" ");
			
		}
		
		scanner.close();
	}

	}
