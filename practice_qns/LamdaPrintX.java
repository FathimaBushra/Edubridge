package practice_qns;

interface MyLamda
{
	/*final int display(int x);
Illegal modifier for the interface method display;
only public, abstract, default, static and strictfp are permitted
	*/
	int display(int x);
}
public class LamdaPrintX {

	public static void main(String[] args) {
				
		MyLamda mylamda= (x)->{
			return x;
		};
		System.out.println("value of x is: ");
		System.out.println(mylamda.display(5)
				);
	}

}
