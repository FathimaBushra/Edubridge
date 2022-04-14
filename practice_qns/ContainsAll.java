package practice_qns;
import java.util.Stack;
import java.util.Scanner;

public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 elements...");
		for(int i=0;i<=5;i++)
		{
		stack.push(scanner.next());
		}
		System.out.println(stack);
		Stack<String> stack2=(Stack<String>)stack.clone();
		System.out.println("After clone stack2: "+stack2);
		System.out.println(stack.containsAll(stack2));
		
		stack2.push("bushra");
		System.out.println("After push stack2: "+stack2);
		System.out.println(stack.containsAll(stack2));
		
		stack.push("fathima");
		System.out.println("After push stack: "+stack);
		stack2.remove("bushra");
		System.out.println("After remove stack2: "+stack2);
		System.out.println(stack.containsAll(stack2));
		

	}

}
