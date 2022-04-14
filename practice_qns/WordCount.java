package practice_qns;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Q.3 Create a program to calculate the no. of capital letters, smaller letters ,
  digits and special symbols in a string.
		E.g. : Admin@123

		Capital letters : 1
		Small letters : 4
		symbol : 1
		digit : 3
		 * 
		 * 
		 * 
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String of capital letters, smaller letters, digits and special symbols... ");
		String str=scanner.nextLine();
		int uppercase=0, lowercase=0,digits=0, special_symbols=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				uppercase++;
			}
			else if(ch>='a' && ch<='z')
			{
				lowercase++;
			}
			else if(ch>=0 && ch<=9)
			{
				digits++;
			}
			else
			{
				special_symbols++;
			}
		}
		System.out.println("Number of Capital letters in a string is..."+uppercase);
		System.out.println("Number of Samll letters in a string is..."+lowercase);
		System.out.println("Number of Digits in a string is..."+digits);
		System.out.println("Number of Special Symbols in a string is..."+special_symbols);
		
		scanner.close();
	}

}
