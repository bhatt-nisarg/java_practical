package pack2;
import pack1.A;
public class E
{
	A a1;
	public E()
	{
		a1 = new A();
		System.out.println("E() is called");
	}
	public void showE()
	{
		//System.out.println("PRIVATE A : " + a1.pri_a);
		//System.out.println("DEFAULT A : " + a1.def_a);
		//System.out.println("PROTECTED A : " + a1.pro_a);
		System.out.println("PUBLIC A : " + a1.pub_a);
	}	
}