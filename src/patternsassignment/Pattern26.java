package patternsassignment;
import java.util.Scanner;
public class Pattern26 {
/* 			if n=5,
			o/p:
				1 3 6 10 15
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
			num=num+i+1;
		}
		scanner.close();
	}

	}
