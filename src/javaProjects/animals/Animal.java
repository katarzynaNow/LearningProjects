package javaProjects.animals;

public class Animal {
    String name;

    public Animal() {
        this.name = "animal";
    }

    String showName(){
        return name;
    }

    String makeSound() {
        return "???";
    }

    void introduce(){
        System.out.println("My name is " + showName() + ": " + makeSound());
    }
}
