import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWords {
    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";
        String wordToReplace = "word1";
        String replacementWord = "word2";
        
        try {
            int replacements = replaceWords(inputFile, outputFile, wordToReplace, replacementWord);
            System.out.println("Number of replacements: " + replacements);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static int replaceWords(String inputFile, String outputFile, String wordToReplace, String replacementWord) throws IOException {
        int replacements = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(wordToReplace, replacementWord);
                replacements += countReplacements(line, wordToReplace, replacementWord);
                writer.write(line);
                writer.newLine();
            }
        }
        return replacements;
    }

    private static int countReplacements(String line, String wordToReplace, String replacementWord) {
        int count = 0;
        int index = line.indexOf(wordToReplace);
        while (index != -1) {
            count++;
            index = line.indexOf(wordToReplace, index + wordToReplace.length());
        }
        return count;
    }
}
