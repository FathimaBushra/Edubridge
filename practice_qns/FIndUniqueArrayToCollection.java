package practice_qns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FIndUniqueArrayToCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		int arr[]=new int[10];
		//take user input
		for(int i=0;i<10;i++)
		{
			arr[i]=scanner.nextInt();
		}
		//initialize treeset -> it allows no duplicacy
		TreeSet<Integer> treeset=new TreeSet<>();
		
		for(int i=0;i<10;i++)
		{
			//if treeset has no elements of arr then add arr to treeset
			//as it allows no duplicacy
			//only unique elements stored
			if(!treeset.contains(arr[i]))
			{
				treeset.add(arr[i]);
			}
		}
		//print treeset which contains unique elements
		Iterator<Integer> itr=treeset.iterator();
		System.out.println("Unique elements: ");
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}	
//		List<Integer> list=Arrays.asList(arr);
//		Set<Integer> hset=new HashSet<>(list);
//		Iterator<Integer> itr=hset.iterator();
//		while(itr.hasNext())
//		{
//			arr[itr]=scanner.nextInt();
//			System.out.println(arr[itr]);
//		}		
		scanner.close();

	}

}
