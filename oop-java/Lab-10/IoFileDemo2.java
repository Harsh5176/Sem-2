

import java.io.*;


public class IoFileDemo2 {
    public static void main(String[] args) {
        
       try {
           String line;
           String word1 = "Harsh";
           int readline=0;
        int charCount=0;
        int wordCount=0;

        // File F = new File("Hrsh.txt");
        // System.out.println(F.getPath());
        
        FileReader  Fr = new FileReader("Harsh.txt");
        BufferedReader Br = new BufferedReader(Fr);

         while ((line = Br.readLine())!=null){
            readline++;
            charCount += line.length();
                
            String[] words = line.split(" ");
                for(int i=0;i<words.length;i++){
                    if(word1.equals(words[i])){
                        words[i] = words[2];
                    }
                }
                wordCount += words.length;

        }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + readline);
            

       } catch (Exception e) {
        System.out.println(e);
       }
    }
}

