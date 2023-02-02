package javaProjects.washingMachine;

public class WashingMachine {
    private int temperature;
    private int spinning;

    public void modeForSensitiveClothes() {
        temperature = 30;
        spinning = 800;
    }

    public void modeForTowelsAndBedLinen () {
        temperature = 90;
        spinning = 1200;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "temperature=" + temperature +
                ", spinning=" + spinning +
                '}';
    }
}
