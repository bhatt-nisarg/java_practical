package pack1;
import pack1.A;
public class C
{
	A a1;
	public C()
	{
		a1 = new A();
		System.out.println("C() is called");
	}
	public void showC()
	{
		//System.out.println("PRIVATE A : " + a1.pri_a);
		System.out.println("DEFAULT A : " + a1.def_a);
		System.out.println("PROTECTED A : " + a1.pro_a);
		System.out.println("PUBLIC A : " + a1.pub_a);
	}
}