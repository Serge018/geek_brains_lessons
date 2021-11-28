/**
 * Java 1. Homework 7
 *
 * @author Sergey Ivenskiy
 * @version 28.11.2021
 */
public class Lesson07 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10);
        Plate plate = new Plate(30);

        cat.eat(plate);

        System.out.println(cat);
        System.out.println(plate);
    }
}