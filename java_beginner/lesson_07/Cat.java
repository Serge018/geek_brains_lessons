/**
 * Java 1. Homework 7
 *
 * @author Sergey Ivenskiy
 * @version 28.11.2021
 */
public class Cat {
    private String name;
    private int appetite;
    private boolean foolness = false;


    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public void eat(Plate plate) {
        if (foolness) {
            return;
        }

        foolness = plate.decreaseFood(appetite);
    }


    @Override
    public String toString() {
        return "Cate: " + name + ", appetite: " + appetite + ", is foolness: " + foolness;
    }
}