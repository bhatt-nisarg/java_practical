import java.util.*;
class M
{
     void fibo(int a)
     {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
     }
public static void main(String args[])
{
   System.out.println("Enter the first number:");
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();

  M obj1=new M();
   obj1.fibo(a);
}
} 