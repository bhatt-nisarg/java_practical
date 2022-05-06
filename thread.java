import java.lang.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println(i+"is even number");
			}		
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i+"is odd number");
			}		
		}
	}
}
class MainThread
{
	public static void main(String args[])
	{
		A obj1=new A();
		B obj2=new B();
		Thread t1=new Thread(obj1,"child1");
		Thread t2=new Thread(obj2,"child2");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
	}
}
