package patternsassignment;
import java.util.Scanner;
public class Pattern24 {
/*	if n=7
			o/p:
				1 1 2 3 5 8 13
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int first=1,second=1;

		for (int i = 1; i <= n; i++) 
		{	
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;
			}
		scanner.close();
	}

}
