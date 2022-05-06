class A
{  
	void m()
	{	
		System.out.println("hello m");
	}  
	void n()
	{  
		System.out.println(" hello n");  
		//m(); 
		this.m();  
	}  
}  
class B
{  
	public static void main(String args[])
	{  
		A obj1=new A();  
		obj1.n();  
	}	
}

