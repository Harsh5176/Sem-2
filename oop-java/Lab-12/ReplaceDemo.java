import java.io.*;
import java.util.Scanner;

public class ReplaceDemo {
    public static void main(String[] args) {
       
        try {
            File file = new File("abc.txt");

            while (sc.hasNextLine()) {
    
                String line = sc.NextLine();
                line = line.replace("Harsh", "jash");
                
            }
        } catch (Exception e) {
            
        }

    }
}
