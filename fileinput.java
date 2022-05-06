import java.io.FileInputStream;  
class A {  
     public static void main(String args[])throws Exception{    
          try{    
            FileInputStream fin=new FileInputStream("nb.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }

