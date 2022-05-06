
import java.util.*;
class student
{
int rollno;
String name;
int age;
student(int rollno, String name, int age)
{
this.rollno=rollno;
this.name=name;
this.age=age;
}
}
class A
{
public static void main(String args[])
{
student s1=new student(101,"nisarg",02);
student s2=new student(102,"yashesh",01);
student s3=new student(103,"rahul",41);
ArrayList<student> list= new ArrayList<student>();
list.add(s1);
list.add(s2);
list.add(s3);
Iterator itr=list.iterator();
while(itr.hasNext())
{
student st=(student)itr.next(); 
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}
}
