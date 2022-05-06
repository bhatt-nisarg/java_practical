class N
{
	public static void main(String args[])
	{
	String s1="Hello";
	String s2="World";
	StringBuffer sb1=new StringBuffer("Hi");
	sb1.delete(1,3);  
	System.out.println(sb1);
	sb1.reverse();  
	System.out.println(sb1);
	System.out.println(s1.concat(s2));
	System.out.println(s1.equals(s2));
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	}
}
