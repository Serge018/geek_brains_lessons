/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;


    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    @Override
    public String toString() {
        String result = this.name + ", " + this.color + ", " + this.age;

        return result;
    }
}