package patternsassignment;
import java.util.Scanner;
public class Pattern27 {
/* 					if n=5,
			o/p:
				5 10 20 40 80
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		

		for (int i = 1; i <= 5; i++) 
		{
			
			System.out.print(n+" ");
			n*=2;
		
		}
		
		scanner.close();
	}

	}
