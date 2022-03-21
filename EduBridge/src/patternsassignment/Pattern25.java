package patternsassignment;
import java.util.Scanner;
public class Pattern25 {
/* if n=6,
			o/p:
				2 3 4 9 8 27
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int even=3,odd=2;

		for (int i = 1; i <= n; i++) 
		{	
			if(i%2==0) {
				
			System.out.print(even+" ");
			even=even*3;
			}
			else 
			{
				
			System.out.print(odd+" ");
			odd=odd*2;
			}
		}
		
		scanner.close();
	}

	}
