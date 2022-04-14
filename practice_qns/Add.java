package practice_qns;
import java.util.*;
public class Add {

	public static void main(String[] args) {

		Add a1=new Add();
		a1.add();
	}
	void add()
	{
		System.out.println("Enter size:");
		Scanner scanner =new Scanner(System.in);
		int size=scanner.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter "+size +" elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		int add=0;
		for(int i=0;i<arr.length;i++)
		{
			add=add+arr[i];
		}
		System.out.println("Sum of all elements:"+add);
		scanner.close();
	}
}
