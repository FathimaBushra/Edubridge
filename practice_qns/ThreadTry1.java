package practice_qns;

public class ThreadTry1 extends Thread {

	public static int amount=0;
	
	public static void main(String[] args) {
		
		ThreadTry1 threadTry1 = new ThreadTry1();	
		ThreadTry1 threadTry2 = new ThreadTry1();
		ThreadTry1 threadTry3 = new ThreadTry1();
		
		threadTry2.setPriority(MAX_PRIORITY);
		threadTry3.setPriority(NORM_PRIORITY);
	    threadTry1.setPriority(MIN_PRIORITY);
		
		threadTry1.start();	
		threadTry2.start();		
		threadTry3.start();
		amount+=5;
		System.out.println("After Start: "+amount);
		
		while(threadTry1.isAlive())
		{	
			while(threadTry2.isAlive())
			{
				while(threadTry3.isAlive())
				{
					System.out.println("IsAlive: "+amount);
				}
			}
			
		}		
	}	
	public void run()
	{	
		
		amount+=10;
		System.out.println(Thread.currentThread().getName()+"....Priority of running thread: "+Thread.currentThread().getPriority());
	}
}
