package practice_qns;

public class PolymorphismRevise {
	
	public static void main(String[] args)
	{
		Add1 add=new Add1();
		add.add(1, 2);
		add.add(1, 2,3);
		add.add(1, 2,3,4);
		add.add(1, 2,3,4,5);
	}
}
 class Add1
{
	
	int add(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void add(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
	void add(int a,int b,int c,int d,int e)
	{
		System.out.println(a+b+c+d+e);
	}
}
