import java.lang.*;

class A
{
A()
{
System.out.println("hello");
}
void op()
{
System.out.println("nisarg");
int a=10;
}
}
class B extends A
{
int a=10;
B()
{
super();
System.out.println("welcome");
}
void op1()
{super.op();
System.out.println("super.a+this.a");}

public static void main(String args[])
{
B obj1=new B();
obj1.op1();
}
}
