import java.util.Scanner;
public class ConsonantsVowels {
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String :");
        String str = sc.nextLine();
    
         int v=0,c=0;
        
        
         for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A' || ch=='E'|| ch=='I'|| ch=='O' || ch=='U'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("Vowels =" + v);
        System.out.println("Consonants =" + c);
        sc.close();
    }
}
