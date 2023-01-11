package javaProjects.shelter;

public class Bird extends Animal{
    private static int numInstances;
    private static String type = "bird";

    public Bird() {
        numInstances++;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceNumber() {
        return numInstances;
    }
}
