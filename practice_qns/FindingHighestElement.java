package practice_qns;
import java.util.Scanner;
public class FindingHighestElement {

	public static void main(String[] args) {
		// Finding the highest number from 1-D rray
		
		int ar[]=new int[5];//array as an object
		Scanner scanner=new Scanner(System.in);
		
		//0 1 2 3 4
		//intialize the array
		//user interaction
		
		System.out.println("Enter 3 elements: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		System.out.println("The Elements of the array are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		scanner.close();
		int highest=ar[0];
		int position=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>highest)
			{
				highest=ar[i];
				position=i+1;
			}
		}
		System.out.println("The Highest element is: "+highest+"\nThe position of the element is:  "+position+"\nThe Index of the element is: "+(position-1));
	}

}
