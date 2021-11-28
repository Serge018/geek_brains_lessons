/**
 * Java 1. Homework 7
 *
 * @author Sergey Ivenskiy
 * @version 28.11.2021
 */
public class Plate{
    private int food;


    Plate(int food) {
        this.food = food;
    }


    public boolean increaseFood(int food) {
        boolean result;

        if (food <= 0) {
            result = false;
        } else {
            this.food += food;
            result = true;
        }

        return result;
    }


    public boolean decreaseFood(int food) {
        boolean result;

        if (this.food < food) {
            result = false;
        } else {
            this.food -= food;
            result = true;
        }

        return result;
    }


    @Override
    public String toString() {
        return "Plate has food: " + food;
    }
}