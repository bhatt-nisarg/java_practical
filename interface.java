interface A
{
	int i=10;
}
class B
{
	int j=20;
}
interface C extends A
{
	int k=30;
}
class D extends B implements C
{
	void op()
	{
	System.out.println(i+j+k);
	}
	public static void main(String args[])
	{
	D obj1=new D();
	obj1.op();
	}
}
	