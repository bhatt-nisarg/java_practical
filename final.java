import java.lang.*;
final class I
{
      final void op(int a,int b)
      {
      System.out.println(a+b);
      }
}
class J extends I
{
      void op(int a,int b)
      {
      System.out.println(a-b);
      }

public static void main(String args[])
{
   J obj1=new J();
   obj1.op(20,10);
   final int a=10;
   a++;
}
}