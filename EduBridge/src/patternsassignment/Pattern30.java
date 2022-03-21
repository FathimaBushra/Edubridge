package patternsassignment;
import java.util.Scanner;
public class Pattern30 {
/* 		if n=5,
			o/p:
				1 4 9 16 25
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			
			System.out.print(i*i+" ");
			
		}
		
		scanner.close();
	}

	}
