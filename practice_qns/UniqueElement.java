package practice_qns;
import java.util.*;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take an array of size 10 from user allowing duplicacy 
		//and return unique elements only

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		int arr[]=new int[10];
		int uniquearr[]=new int[10];
		int index=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					count=1;
					break;
				}
			}		
			if(count==0)
			{
				uniquearr[index]=arr[i];
				index++;
			}
		}
		System.out.println("Unique Elements are: ");
		for(int i=0;i<index;i++)
		{
			System.out.println(uniquearr[i]);
		}
		scanner.close();
	}

}
