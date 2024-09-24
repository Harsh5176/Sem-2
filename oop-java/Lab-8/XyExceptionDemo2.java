 import java.util.Scanner;
 public class XyExceptionDemo2 {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        double c=0;
        
        try{
            System.out.print("Enetr a Number a:");
            double a = sc.nextDouble(); 
            System.out.print("Enetr a Number b:");
            double b = sc.nextDouble(); 

            c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println(c);
        }
    }
 }