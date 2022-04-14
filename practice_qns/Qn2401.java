package practice_qns;

import java.util.Scanner;
import java.util.TreeSet;

//import java.util.*;
public class Qn2401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=scanner.nextInt();
		System.out.println("Enter "+n+" elements:" );
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();
		}
		
		System.out.println("Entered elements are:" );
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i] );
		}
		
		TreeSet<Integer> treeset=new TreeSet<>(); 
		System.out.println(treeset.last());
		/*
		 * int first=ar[0]; int pos=0; int index=0; for(int i=0;i<ar.length;i++)
		 * 
		 * { if(ar[i]>first) { first=ar[i]; pos++; index++; } pos=i; index=pos-1;
		 * 
		 * } System.out.println("highest :"+ first +"Position :"+ pos+ "Index :"+index);
		 */
		/*
		 * String [] myArray=new String[n]; for(int i=0;i<myArray.length;i++) {
		 * System.out.println(""); }
		 */

	
	/*
	 * 
	 */
	scanner.close();
	}

}
