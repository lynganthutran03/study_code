package Problem5;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequency {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the text file: ");
        String filePath = sc.next();
        Map<String, Integer> count = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for(String word: words) {
                    count.put(word, count.getOrDefault(word, 0) + 1);
                }
            }
            System.out.printf("%-20s %s%n", "Word", "Frequency");
            for(Map.Entry<String, Integer> entry: count.entrySet()) {
                System.out.printf("%-20s %d%n", entry.getKey(), entry.getValue());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        }
        catch (IOException e) {
            System.out.println("ERROR: I/O error occurred");
        }
    }
}
