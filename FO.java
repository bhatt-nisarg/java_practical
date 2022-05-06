import java.lang.*;
class G
{
    void op(int a,int b)
    {
     System.out.println(a+b);
    }
    void op(int a,int b,int c)
    {
    System.out.println(a+b+c);
    }
public static void main(String args[])
{
    G obj1=new G();
    obj1.op(10,20);
    obj1.op(20,30,40);
}
}