package javaProjects;

import java.util.Random;

public class ChristmasTree {
    public static void main(String[] args) {
        int numberIn = 18;

        if (args.length > 0) {
            numberIn = Integer.parseInt(args[0]);
        }

        String[] chars = {"+", ".", "*", "-", "^", "°" };
        Random rand = new Random();

        for (int i = 0; i <= numberIn; i++) {
            for (int j = 0; j < numberIn * 2; j++) {
                if (j < (numberIn - i) || j > (numberIn + i)) {
                    System.out.print(" ");
                } else if (j > (numberIn - i) && (j < numberIn + i)){
                    int x = rand.nextInt(6);
                    System.out.print(chars[x]);
                }
            }
            System.out.println();

        }
    }
}
