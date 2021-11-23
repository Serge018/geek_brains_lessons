/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public class Cat extends Animal {
    Cat(String name, String color, int age) {
        super(name, color, age);

        Animal.incrementChildrenCat();
    }


    @Override
    public String voice() {
        return "mew";
    }
}