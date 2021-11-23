/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public class Dog extends Animal {
    Dog(String name, String color, int age) {
        super(name, color, age);

        voice = "gav-gav";
        runLimit = 500;
        swimLimit = 10;

        incrementChildrenDog();
    }
}