import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks :");
        int A = sc.nextInt();

        int temp=A,sum=0,rem;
        
        while(A !=0){

            rem=A%10;
            sum=sum*10+rem;
            A=A/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}
