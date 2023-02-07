package javaProjects.animals;

public class Farm {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal();
        animals[1]= new Pig("Piglet");
        animals[2]= new Pig("Peppa");
        animals[3]= new Dog("Axel");
        animals[4]= new Cat("Dora");


        for (Animal animal: animals) {
            animal.introduce();
        }
    }
}
