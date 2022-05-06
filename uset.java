import java.lang.*;
class ThreadDemo
{
	public static void main(String[] args)  throws Exception
	{
		Thread t = Thread.currentThread();
		// prints the thread name
		System.out.println("Thread = " + t);
		
		t.setName("Admin Thread");
		// prints the thread after changing name
		System.out.println("Thread after changing name = " + t);
		int count = Thread.activeCount();
		System.out.println("currently active threads = " + count);
		for(int i=1;i<=5;i++)
		{
			try
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}




