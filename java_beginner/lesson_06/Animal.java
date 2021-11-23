/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public abstract class Animal implements IAnimal {
    private static int childsCat = 0;
    private static int childsDog = 0;
    protected String name;
    protected String color;
    protected int age;


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
    public String toString() {
        String result = this.name + ", " + this.color + ", " + this.age;

        return result;
    }
}