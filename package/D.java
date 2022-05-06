package pack2;
import pack1.*;
public class D extends A
{
	public D()
	{
		System.out.println("D() is called");	
	}
	public void showD()
	{
		//System.out.println("PRIVATE A : " + pri_a);
		//System.out.println("DEFAULT A : " + def_a);
		System.out.println("PROTECTED A : " + pro_a);
		System.out.println("PUBLIC A : " + pub_a);
	}
}