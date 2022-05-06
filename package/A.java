package pack1;
public class A
{
	private int pri_a;
	int def_a;
	protected int pro_a;
	public int pub_a;
	
	public A()
	{
		System.out.println("A() is called");
		pri_a = 10;
		def_a = 20;	
		pro_a = 30;
		pub_a =50;
	}
	public void show()
	{
		System.out.println("PRIVATE A : " + pri_a);
		System.out.println("DEFAULT A : " + def_a);
		System.out.println("PROTECTED A : " + pro_a);
		System.out.println("PUBLIC A : " + pub_a);
	}	
}