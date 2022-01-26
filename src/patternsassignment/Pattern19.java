package patternsassignment;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	o/p:
		    **   **
	   	   **** ****
	   	   *********
	    	*******
	    	 *****
	    	  ***
	    	   *
*/		
		int n=5;
		for(int i=1;i<=2;i++)
		{
			for(int j=1;j<=2-i;j++)//1st part 
			{
			System.out.print(" ");
			}
			for(int k=1;k<=2*i;k++)//2nd part
			{
				System.out.print("*");
			}
			for(int l=1;l<=2*(2-i+1)-1;l++)//3rd part
			{
				System.out.print(" ");
			}
			for(int m=1;m<=2*i;m++)//4th part
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)	
		{
			for(int sp=i;sp<=n-1;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}	
}


