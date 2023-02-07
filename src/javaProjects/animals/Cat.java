package javaProjects.animals;



public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    String showName() {
            return "cat " + name;
    }
    @Override
    String makeSound() {
        return "meow meow";
    }
}
