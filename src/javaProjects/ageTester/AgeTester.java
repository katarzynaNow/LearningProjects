package javaProjects.ageTester;

public class AgeTester {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeRangeException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        System.out.println("Age: " + age);
     if (age < 18) {
         throw new AgeRangeException("Attention! Person under 18 years of age!");
     } else {
         System.out.println("Access granted.");
     }
    }
}
