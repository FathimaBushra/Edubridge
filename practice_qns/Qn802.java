package practice_qns;

public class Qn802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.show();

	}
}
	class Outer
	{
		class Inner
		{
			void show()
			{
				System.out.println("calling inner class mthod");
			}
		}
	}


