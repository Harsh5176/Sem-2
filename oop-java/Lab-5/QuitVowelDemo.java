// Create a class which ask the user to enter a sentence, and it should
// display count of each vowel type in the sentence. The program should
// continue till user enters a word “quit”. Display the total count of
// each vowel for all sentences. 

import java.util.Scanner;
class Vowel{

    int vowelcount = 0;

    void Count(String s){

    for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A' || ch=='E'|| ch=='I'|| ch=='O' || ch=='U'){
                vowelcount++;
            }
        }
    }
    
}

public class QuitVowelDemo{
    public static void main(String[] args) {
        
        Vowel v = new Vowel();
        Scanner sc = new Scanner(System.in);
       
        while (true) {
            System.out.print("Enter a line :-");
            String s = sc.nextLine();
            
            if(s.equals("quit")){
                break;
            }
            else{
                
                v.Count(s); 
            }
            
        }

        System.out.println(v.vowelcount);
        
        
    }
}
