/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public class Cat extends Animal {
    String MSG_CAT_CANNOT_SWIM = "The cats cannot swim.";


    Cat(String name, String color, int age) {
        super(name, color, age);

        voice = "meow";
        runLimit = 200;

        incrementChildrenCat();
    }


    @Override
    public void swim(int distance) {
        System.out.println(MSG_CAT_CANNOT_SWIM);
    }
}