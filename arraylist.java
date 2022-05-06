
import java.util.*;  
class A
{  
public static void main(String args[])
{  
ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("nisarg");  
list.add("jeet");  
list.add("yashesh");  
Iterator itr=list.iterator();  
while(itr.hasNext())
{  System.out.println(itr.next());  
}  
}  
}  
