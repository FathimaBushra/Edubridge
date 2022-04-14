package practice_qns;

public class ThreadTry extends Thread{
	
	public static int amount=0;
	
	public static void main(String[] args)
	{
		ThreadTry threadTry= new ThreadTry();	
		threadTry.start();
		System.out.println(amount);	
		while(threadTry.isAlive())
		{
			System.out.println("Waiting.....");
			System.out.println("Waiting.... "+amount);
		}		
		amount++;
		System.out.println(amount);
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
				amount++;
		}
		System.out.println("Run output: "+amount);
	}
}
