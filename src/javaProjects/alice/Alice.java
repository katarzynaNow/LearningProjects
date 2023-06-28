package javaProjects.alice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {
    public static void main(String[] args) {
        List allLines = loadTextFile("src/javaProjects/alice/alice30.txt");
        Set words = divideIntoWordsAndClean(allLines);
        Map<Character, Integer> startLetterStats = createStartLetterStats(words);
        Map.Entry<Character, Integer> startLetterEntry = findMostCommonStartLetter(startLetterStats);

        showAllLines(allLines);
        System.out.println("\nUnique words: ");
        System.out.println(words);
        System.out.println("Number of unique words: " + words.size() + ".");
        System.out.println("\nStart letter statistics: ");
        System.out.println(startLetterStats);
        System.out.println("Most common start letter: \"" + startLetterEntry.getKey() + "\", occurred "
                + startLetterEntry.getValue() + " times." );

    }

    public static List loadTextFile (String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Something go wrong with the file loading!" + e.getMessage());
        }
        return null;
    }

    public static void showAllLines(List<String> allLines){
        for (String line: allLines) {
            System.out.println(line);
        }
    }

    public static Set divideIntoWordsAndClean(List<String> allLines){
        Set words = new TreeSet();
        for (String line: allLines) {
            String[] lineWords = line.split(" |--");
            for (String word: lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }
        return words;
    }

    public static String cleanWord(String word){
        //return word.replace(",", " ");
        return word.replaceAll("\\p{Punct}|\\d", "");
    }

    public static Map<Character, Integer> createStartLetterStats(Set<String> words){
        Map<Character, Integer> startLetterStats = new TreeMap<>();
        for (String word : words) {
            Character startLetter = word.charAt(0);
            if (startLetterStats.containsKey(startLetter)){
                startLetterStats.put(startLetter, startLetterStats.get(startLetter) + 1);
            } else {
                startLetterStats.put(startLetter, 1);
            }
        }
        return startLetterStats;
    }

    public static Map.Entry<Character, Integer> findMostCommonStartLetter(Map<Character, Integer> startLetterStats){
        Map.Entry<Character, Integer> startLetterEntry = null;
        for (Map.Entry<Character, Integer> entry: startLetterStats.entrySet()) {
            if(startLetterEntry == null || entry.getValue() > startLetterEntry.getValue()) {
                startLetterEntry = entry;
            }
        }
        return startLetterEntry;
    }
}
