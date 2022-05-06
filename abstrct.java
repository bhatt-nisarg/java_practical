abstract class shape
{
	abstract void area(int dim1, int dim2);
}
class Rect extends shape
{
	void area(int dim1, int dim2)
	{
	System.out.println(dim1*dim2);
	}
}
class Tri extends shape
{
	void area(int dim1, int dim2)
	{
	System.out.println(0.5*dim1*dim2);
	}
}
class Circle extends shape
{
	void area(int dim1, int dim2)
	{
	System.out.println(3.14*dim1*dim2);
	}
}
class A
{
	public static void main(String args[])
	{
	shape s;
	s=new Tri();
	s.area(10,15);
	s=new Rect();
	s.area(5,25);
	s=new Circle();
	s.area(14,14);
	s=new Tri();
	}
}
