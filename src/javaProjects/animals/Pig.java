package javaProjects.animals;


public class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pig " + name;
    }

    @Override
    String makeSound() {
        return "oink oink";
    }
}
