package lab6;

import java.io.*;
import java.util.*;

public class TopWords {

    public static void main(String[] args) {
        File file = new File("text.txt");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        Map<String, Integer> wordCount = new HashMap<>();

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
            if (word.isEmpty()) {
                continue;
            }

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        scanner.close();

        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int limit = Math.min(10, list.size());
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
