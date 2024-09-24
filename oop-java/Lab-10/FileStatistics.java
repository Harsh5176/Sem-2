import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {

    public static void main(String[] args) {
        String filename = "Harsh.txt"; // Change this to the path of your file
        try {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            bufferedReader.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
