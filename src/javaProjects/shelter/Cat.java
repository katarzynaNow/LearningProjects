package javaProjects.shelter;

public class Cat extends Animal{
    private static int numInstances = 0;
    private static String type = "cat";

    public Cat () {
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
