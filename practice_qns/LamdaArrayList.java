package practice_qns;
import java.util.ArrayList;
public class LamdaArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.forEach( (output)->System.out.println(output));
	}
}
