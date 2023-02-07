package javaProjects.animals;


public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "dog " + name;
    }

    @Override
    String makeSound() {
        return "woof woof";
    }
}
