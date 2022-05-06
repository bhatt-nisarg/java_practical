class I
{
    I(int a,int b)
    {
    System.out.println(a+b);
    }
    I(double c,double d)
    {
    System.out.println(c+d);
    }
public static void main(String args[])
{
    I obj1=new I(10,20);
    I obj2=new I(10.5,20.5);
}
}