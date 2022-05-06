import java.util.*;
class A
{
	public static void main(String args[])
	{
		System.out.println("enter the size of array");
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the"+i+"element");
			a[i]=S.nextInt();
			System.out.println(i+"element is"+a[i]);
		}
	}
}
