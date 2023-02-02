package javaProjects.washingMachine;

public class WashingMachineTester {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();

        washingMachine.modeForSensitiveClothes();
        System.out.println(washingMachine);

        washingMachine.modeForTowelsAndBedLinen();
        System.out.println(washingMachine);
    }
}