class D
{
    void op(int a,int b)
    {
     System.out.println(a+b);
    }
public static void main(String args[])
{

int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);

D obj1=new D();
obj1.op(a,b); 

}
}