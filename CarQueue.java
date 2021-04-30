import java.util.PriorityQueue;
import java.util.Random;

public class CarQueue {
	
	
	PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
	Random ranDirection = new Random();
	private int outOfThread;
	
	public CarQueue()
	{
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
		myQueue.add(ranDirection.nextInt(4));
	}
	
	public void addToQueue()
	{
		class MyRunnable implements Runnable
		{

			@Override
			public void run() {
				try
				{
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
					myQueue.add(ranDirection.nextInt(4));
				}
				finally
				{
					
				}
				
			}
			
		}
		Runnable myRun = new MyRunnable();
		Thread myThread = new Thread(myRun);
		
		myThread.start();
	}
	public int deleteQueue() {
		// TODO Auto-generated method stub
		class MyRunnable implements Runnable
		{

			@Override
			public void run() {
				try
				{
					Thread.sleep(2000);
				}
				catch(Exception e)
				{
					
				}
				try
				{
					if(myQueue.size() < 20)
					{
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
						myQueue.add(ranDirection.nextInt(4));
					}
					else if(!myQueue.isEmpty())
					{
						outOfThread = myQueue.remove();
					}
				}
				catch(Exception e)
				{
					
				}
				
			}
			
		}
		Runnable myRun = new MyRunnable();
		Thread myThread = new Thread(myRun);
		
		myThread.start();
		return outOfThread;
	}
}


