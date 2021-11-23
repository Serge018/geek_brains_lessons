/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "black", 7);
        Dog dog = new Dog("Spike", "grey", 8);

        Animal[] animals = { cat, dog };
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.voice());
        }

        Animal.printChildrensInfo();
    }
}
