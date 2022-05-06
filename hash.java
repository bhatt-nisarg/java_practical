
import java.util.*;  
class A
{
public static void main(String args[]){  
HashSet<String> set=new HashSet<String>();  
set.add("dishant");  
set.add("nisarg");  
set.add("jeet");  
set.add("chintan");  
Iterator<String>itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}
