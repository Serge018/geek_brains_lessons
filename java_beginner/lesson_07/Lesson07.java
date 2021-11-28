/**
 * Java 1. Homework 7
 *
 * @author Sergey Ivenskiy
 * @version 28.11.2021
 */
public class Lesson07 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat("Barsik", 10),
            new Cat("Bob", 35),
            new Cat("Murzik", 3),
            new Cat("Musya", 12)
        };

        Plate plate = new Plate(40);

        // Feed the cats
        for (Cat cat : cats) {
            cat.eat(plate);
            // System.out.println(cat);
            // System.out.println(plate);
        }

        // Refilling the plate with food
        plate.increaseFood(40);
        // System.out.println("\n");

        // Feed the cats again
        for (Cat cat : cats) {
            cat.eat(plate);
            // System.out.println(cat);
            // System.out.println(plate);
        }
    }
}