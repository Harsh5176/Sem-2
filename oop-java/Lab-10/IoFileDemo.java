/*
1. Write a program that counts number of characters, words, and lines
in a file. Use exceptions to check whether the file that is read
exists or not.*/


import java.io.*;


public class IoFileDemo {
    public static void main(String[] args) {
        
       try {
        String line;
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
