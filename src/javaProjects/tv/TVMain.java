package javaProjects.tv;

import java.util.Scanner;

public class TVMain {
    public static void main(String[] args) {
        //tvManipulation();
        remoteManipulation();
    }

    private static void tvManipulation() {
        Scanner scanner = new Scanner(System.in);
        TV tv = new P55PUS7334("123456");

        int option = 0;
        System.out.println("1. Turn on; 2. Turn off; 3. Change channel;");
        while(option != 4) {
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    tv.turnOn();
                    break;
                case 2:
                    tv.turnOff();
                    break;
                case 3:
                    System.out.println("Enter the program number: ");
                    int number = scanner.nextInt();
                    tv.changeTelevisionProgram(number);
                    break;
            }
        }
        scanner.close();
    }

    private static void remoteManipulation() {
        RemoteControl remoteControl = new Remote();
        TV television = new P55PUS7334("123");
        remoteControl.pairTv(television);

        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("0. Press red ; 1. Press 1; 2. Press 2; 3. Press 3;");
        do {
            option = scanner.nextInt();
            switch(option) {
                case 0:
                    remoteControl.pressRed();
                    break;
                case 1:
                    remoteControl.pressOne();
                    break;
                case 2:
                    remoteControl.pressTwo();
                    break;
                case 3:
                    remoteControl.pressThree();
                    break;
            }
        } while(option!=4);

        scanner.close();
    }
}
