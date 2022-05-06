class G
{
   void op(int a,int b)
   {
    System.out.println(a+b);
   }
}
class H extends G
{
   void op(int a,int b)
   {
    System.out.println(a-b);
   }
public static void main(String args[])
{
  H obj1=new H();
  obj1.op(20,10);
}
}