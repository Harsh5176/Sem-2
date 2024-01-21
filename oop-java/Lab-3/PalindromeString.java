import java.util.Scanner;
public class PalindromeString {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String :");
        String str = sc.next();

        String  empty = "";
        
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(str.length()-1-i);
            empty = empty + ch;
        }

        if(empty.equals(str))
        {
            System.out.println("Your string is palindrome.");
        }
        else
        {
            System.out.println("Your string is not palindrome.");
        }
    }
}
