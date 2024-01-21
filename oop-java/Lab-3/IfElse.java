import java.util.Scanner;
public class IfElse {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks :");
        int A = sc.nextInt();
        //System.out.println("Value of A"+A);

        System.out.print("Enter your marks :");
        int B = sc.nextInt();

        System.out.print("Enter your marks :");
        int C = sc.nextInt();

        System.out.print("Enter your marks :");
        int D = sc.nextInt();

        System.out.print("Enter your marks :");
        int E = sc.nextInt();

        double pt = (A+B+C+D+E)*100/500;

        System.out.println("Your % is = "+ pt);

        if(pt>=60){
                
            System.out.println("You'r pass with First class.");
        }
        else if(pt<=59 && pt>=50){

            System.out.println("You'r pass with Second class.");
        }
        else if(pt<=49 && pt>=40){

            System.out.println("You'r pass with Third class.");
        }
        else if(pt<40){

            System.out.println("You'r Fail.");
        }

    }

    
}

