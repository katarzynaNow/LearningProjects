import java.sql.SQLOutput;

public class MostFrequent {
    public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counter = new int[10];

        for (int i = 0; i < array.length; i++) {
            counter[array[i]]++;
        }

        System.out.print("Array elements: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        int mostFrequent = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > counter[mostFrequent]) {
                mostFrequent = i;
            }
        }
        System.out.println();
        System.out.print("Most frequent figure is " + mostFrequent);
        System.out.println(", appears " + counter[mostFrequent] + " times.");

    }
}
