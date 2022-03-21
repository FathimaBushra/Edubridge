package patternsassignment;

import java.util.Scanner;

public class Pattern2 {
	/*
	 * Output 
11111 
22222
33333
44444 
55555
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				System.out.print(i);
			}
			System.out.println();
		}
		scanner.close();
	}

}
