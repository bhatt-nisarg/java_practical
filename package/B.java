package pack1;
public class B extends A
{
	public B()
	{
		System.out.println("B() is called");
	}
	public void showB()
	{
		//System.out.println("PRIVATE A : " + pri_a);
		System.out.println("DEFAULT A : " + def_a);
		System.out.println("PROTECTED A : " + pro_a);
		System.out.println("PUBLIC A : " + pub_a);
	}
}