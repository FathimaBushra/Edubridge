package practice_qns;

import java.util.Scanner;

public class MutiThreading8 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n1,n2,n3,n4;
		System.out.println("Enter number for MT1: ");
		n1=scanner.nextInt();
		System.out.println("Enter number for MT2: ");
		n2=scanner.nextInt();
		System.out.println("Enter number for MT3: ");
		n3=scanner.nextInt();
		System.out.println("Enter number for MT4: ");
		n4=scanner.nextInt();
		MT11 mt1=new MT11(n1);
		MT22 mt2=new MT22(n2);
		MT33 mt3=new MT33(n3);
		MT44 mt4=new MT44(n4);
		mt1.setName("One");
		mt2.setName("Two");
		mt3.setName("Three");
		mt4.setName("Four");
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}
}
class Demo1
{
	synchronized static void show(int n)
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
		}
	}
	void display(int n) {
		System.out.println("Enter number ");
		
	}
}

class MT11 extends Thread
{
	int n1;
	
	MT11(int n1)
	{
		this.n1=n1;	
	}
	public void run()
	{
		Demo1.show(n1);
	}
}


class MT22 extends Thread
{
	int n1;
	
	MT22(int n1)
	{
		this.n1=n1;
	}
	public void run()
	{
		Demo1.show(n1);
	}
}

class MT33 extends Thread
{
	int n1;
	
	MT33(int n1)
	{
		this.n1=n1;	
	}
	public void run()
	{
		Demo1.show(n1);
	}
}

class MT44 extends Thread
{
	int n1;
	
	MT44(int n1)
	{
		this.n1=n1;	
	}
	public void run()
	{
		Demo1.show(n1);
	}
}



