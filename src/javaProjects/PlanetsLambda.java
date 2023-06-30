package javaProjects;

import java.util.Arrays;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Starurn", "Uran", "Neptun"};

        System.out.print("Alfabetycznie: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        //klasa anonimowa
/*        System.out.print("Wg długości nazwy: ");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Arrays.sort(planets, comparator);
        System.out.println(Arrays.toString(planets));*/

        //lambda
        System.out.print("Wg długości nazwy: ");
        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());
        Arrays.asList(planets).forEach(s -> System.out.print(s + " "));
    }
}
