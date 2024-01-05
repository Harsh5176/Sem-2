import java.util.*;
public class Fahrenheit {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr r :");
        int f=sc.nextInt();
    	
       double c = f-32*5/9;

    	System.out.println(c);
    }
}