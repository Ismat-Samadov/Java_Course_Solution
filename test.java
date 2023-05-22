
import java.util.Scanner;
public class test {

    
    public static void main(String[] args) {
        boolean flag;
        String n;
        do
        {
 
        System.out.println("Enter Integer Value only");
 
        Scanner sc = new Scanner(System.in);
 
        n = sc.next();
        try
        {
            Integer.parseInt(n);
            flag=false;
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter only integer value");
            flag=true;
        }
      
        
        }while(flag);
       
    
        System.out.println("Integer value is "+n);
    }
    
    
}