package patternsassignment;
import java.util.Scanner;
public class Pattern23 {
/*	if n=5,
			o/p:
				1 2 4 4 7 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int even=2,odd=1;
		for (int i = 1; i <= n; i++) 
		{			
			if(i%2==0) {
			System.out.print(even+" ");
			even=even+2;
			}
			else  {
			System.out.print(odd+" ");
			odd=odd+3;
			}
		}
		scanner.close();
	}

}
