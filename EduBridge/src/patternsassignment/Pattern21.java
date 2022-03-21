package patternsassignment;
import java.util.Scanner;
public class Pattern21 {
/*	o/p:
		1 4 7 10 13
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
			num=num+3;
		}
		scanner.close();

	}

}
