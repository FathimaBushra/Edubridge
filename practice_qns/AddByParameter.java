package practice_qns;
import java.util.Scanner;

public class AddByParameter {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add a1=new Add();
		System.out.println("Enter size:");
		Scanner scanner =new Scanner(System.in);
		int size=scanner.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter "+size +"of elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println(add(arr));
		scanner.close();
		
	}


	static int add(int ...arr)
	{
		
		int add=0;
		for(int i: arr)
		{
			add=add+i;
		}
		return add;
	}
	
	
}
