package practice_qns;
import java.util.*;
public class Collection2402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=scanner.nextInt();
		System.out.println("Enter "+size+" elements: ");
		ArrayList<Integer> al= new ArrayList<>();
		//inserting elements into the list
		for(int i=0;i<size;i++)
		{
			al.add(scanner.nextInt());
		}
		scanner.close();
		//fetching elements in list
		System.out.println("Elements in list: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//removing 
		al.remove(Integer.valueOf(10));
		System.out.println("Elements in list after remove: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		//adding
		al.set(0,12);
		System.out.println("Elements in list after update: ");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}
}
