import java.util.*;
class L
{
     void fact(int a)
     {
      int i,fact=1;  
      int number=5;    
      for(i=1;i<=number;i++){    
      fact=fact*i;    
     System.out.println("Factorial of "+number+" is: "+fact);
     }
}
public static void main(String args[])
{
   System.out.println("Enter the first number:");
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();

  L obj1=new L();
   obj1.fact(a);
}
} 