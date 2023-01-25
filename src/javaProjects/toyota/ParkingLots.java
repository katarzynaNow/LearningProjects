package javaProjects.toyota;

import java.util.Random;

public class ParkingLots {
    public static void main(String[] args) {

    Car[] motomachi = new Car[5000];
    Car[] tsutsumi = new Car[4500];
    Car[] tahara = new Car[1700];

    String[] models = {"Yaris", "Corolla", "Aygo"};
    String[] colors = {"silver", "blue", "black"};
    int[] years = {2018, 2019, 2020};

    Random random = new Random();

        for (int i = 0; i < motomachi.length; i++) {
            int m = random.nextInt(3);
            int c = random.nextInt(3);
            int y = random.nextInt(3);

            motomachi[i] = new Car(models[m], colors[c], years[y]);
        }

        for (int i = 0; i < tsutsumi.length; i++) {
            int m = random.nextInt(3);
            int c = random.nextInt(3);
            int y = random.nextInt(3);

            tsutsumi[i] = new Car(models[m], colors[c], years[y]);
        }

        for (int i = 0; i < tahara.length; i++) {
            int m = random.nextInt(3);
            int c = random.nextInt(3);
            int y = random.nextInt(3);

            tahara[i] = new Car(models[m], colors[c], years[y]);
        }

        //how many silver 2020 Toyota Yaris cars are in the Motomachi parking lot
        int counter = 0;
        for (int i = 0; i < motomachi.length; i++) {
            if ((motomachi[i].getModel().equals("Yaris")) && (motomachi[i].getColor().equals("silver")) && (motomachi[i].getYear() == 2020)) {
                counter ++;
            }
        }
        System.out.println("In Motomachi parking lot there are " + counter + " silver Toyota Yaris cars from 2020." );
        System.out.println("---------------------------------");

        //what color of the car is the most popular of Tsutsumi parking lot
        int silverCounter = 0;
        int blueCounter = 0;
        int blackCounter = 0;
        for (int i = 0; i < tsutsumi.length; i++) {
            switch (tsutsumi[i].getColor()) {
                case "sliver" :
                    silverCounter++;
                case "blue" :
                    blueCounter++;
                case "black" :
                    blackCounter++;
            }
        }

        System.out.print("The most poular color on Tsutsu parking lot is ");
        if (silverCounter < blueCounter) {
            System.out.println("blue.");
            System.out.println("There are " + blueCounter + " cars in this color.");
        } else if (blueCounter< blackCounter) {
            System.out.println("black.");
            System.out.println("There are " + blackCounter + " cars in this color.");
        } else {
            System.out.println("silver.");
            System.out.println("There are " + silverCounter + " cars in this color.");
        }
        System.out.println("---------------------------------");

        //first 10 cars on the Tahara parking lot
        System.out.println("First 10 cars at Tahara parking lot: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i].toString());
        }
    }
}
