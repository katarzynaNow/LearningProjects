package javaProjects.monteChristo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {
        MonteChristo mc = new MonteChristo();
        List<String> allLines = mc.loadTextFile("src/javaProjects/MonteChristo/cristo.txt");
        mc.showAllLines(allLines);
        mc.showEveryHundredthLine(allLines);
        System.out.println("\nNumber of rows: " + mc.countLines(allLines));
        mc.showTheLongestVerse(allLines);

    }

    List<String> loadTextFile(String textFileName){
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Something go wrong with the file loading!" + e.getMessage());
        }
        return null;
    }

    void showAllLines(List<String> allLines){
        for (String line: allLines) {
            System.out.println(line);
        }
    }

    int countLines(List allLines){
        return allLines.size();
    }

    void showEveryHundredthLine(List<String> allLines){
        System.out.println();
        for (int i = 0; i < allLines.size(); i++) {
            if (i%100 == 0){
                System.out.println(i + ": " + allLines.get(i));
            }
        }
    }

    void showTheLongestVerse(List<String> allLines){
        String longestLine = "";
        for (String line: allLines) {
            if (line.length() > longestLine.length()){
                longestLine = line;
            }
        }
        System.out.println("\nThe longest line contains: " + longestLine.length() + " characters - "
        + longestLine.toUpperCase());
    }
}
