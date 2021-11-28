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


    public void decreaseFood(int food) {
    	this.food -= food;
    }


    @Override
    public String toString() {
        return "Plate has food: " + food;
    }
}