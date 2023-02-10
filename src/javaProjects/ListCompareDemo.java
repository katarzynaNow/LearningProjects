package javaProjects;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCompareDemo {
    public static final int MAX_VAL = 1_000_000;
    public static void main(String[] args) {
       // List<Integer> numbers = new LinkedList<>();
        List<Integer> numbers = new ArrayList<>();
        fillList(numbers);

        long startTime = System.currentTimeMillis();
        insertInMiddle(numbers);

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime + " milliseconds");
    }

    static void fillList(List list) {
        for (int i = 0; i <= MAX_VAL; i++) {
            list.add(i);
        }
    }

    static void insertInMiddle(List list) {
        int half = MAX_VAL/2;
        int part = MAX_VAL/10;
        ListIterator iterator = list.listIterator(half);
        for (int i = 0; i <= part; i++) {
            iterator.add(0);
        }

    }
}
