package javaProjects.computation;

public class ComputationTester {
    public static void main(String[] args) {

        double x = 7.0;
        double y = 4.4;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.printf("Add: %.2f%n",Computation.ADD.perform(x,y));
        System.out.printf("Subtract: %.2f%n", Computation.SUBTRACT.perform(x,y));
        System.out.printf("Multiply: %.2f%n", Computation.MULTIPLY.perform(x, y));
        System.out.printf("Divide: %.2f%n",  Computation.DIVIDE.perform(x, y));
    }
}
