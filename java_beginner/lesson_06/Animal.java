/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public abstract class Animal implements IAnimal {
    protected String voice;
    protected String name;
    protected String color;
    protected int age;
    protected int runLimit;
    protected int swimLimit;
    private static int childsCat = 0;
    private static int childsDog = 0;


    Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public static int incrementChildrenCat() {
        return childsCat++;
    }


    public static int incrementChildrenDog() {
        return childsDog++;
    }


    public static void printChildrensInfo() {
        System.out.println("childs\nCats : " + childsCat + "\nDog : " + childsDog);
    }


    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " meters.");
        }
    }


    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " run " + distance + " meters.");
        }
    }


    @Override
    public String voice() {
        return voice;
    }


    @Override
    public String toString() {
        String result = this.name + ", " + this.color + ", " + this.age;

        return result;
    }
}