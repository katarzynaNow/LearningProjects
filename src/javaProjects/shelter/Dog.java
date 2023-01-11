package javaProjects.shelter;

public class Dog extends Animal{
    private static int numInstances = 0;
    private static String type = "dog";

    public Dog() {
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
