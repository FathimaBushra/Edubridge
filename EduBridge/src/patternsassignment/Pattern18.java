package patternsassignment;
import java.util.Scanner;
public class Pattern18 {
/* output
  				    1
				   2*2
				  3*3*3
				 4*4*4*4
				5*5*5*5*5
				 4*4*4*4
				  3*3*3
				   2*2
				    1
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			for (int j =n-1; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print(i);
				}
			}
				for(int l=i-1;l>=1;l--)
				{
					if(l%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print(i);
					}
				}
			System.out.println();
		}
		
		for (int i =n- 1; i >= 1; i--) 
		{
			for (int j =n-1; j >= i; j--) 
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print(i);
				}
			}
				for(int l=i-1;l>=1;l--)
				{
					if(l%2==0) {
						System.out.print("*");
					}
					else {
						System.out.print(i);
					}
				}
			System.out.println();
		}
		scanner.close();

	}
}
