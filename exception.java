import java.lang.*;
class A
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
			if(b==0)
			{
				throw new Exception("dont take value of b as 0"); 
			}
			else
			{
			System.out.println(a/b);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{ 
			System.out.println("Finished");
		}
	}
}
