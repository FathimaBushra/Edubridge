package patternsassignment;
import java.util.Scanner;
public class Pattern29 {
/* 			if n=5,
				1 2 6 24 120
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int num=1;
		for (int i = 1; i <= n; i++) 
		{
			
			System.out.print(num+" ");
			num=num+num*i;
			
		}
		
		scanner.close();
	}

	}
