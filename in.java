import java.io.FileInputStream;  
 class DataStreamExample {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("1.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  