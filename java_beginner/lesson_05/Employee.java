/**
 * Java 1. Homework 5. Employee class implementation
 *
 * @author Sergey Ivenskiy
 * @version 21.11.2021
 */
public class Employee {
    private String fullName;
    private String position;
    private String phone;
    private String email;
    private int salary;
    private int age;


    public Employee(String fullName, String position, String phone, String email, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return this.age;
    }


    public boolean setAge(int age) {
        if (age < 0) {
            return false;
        }
        this.age = age;

        return true;
    }


    @Override
    public String toString() {
        String result = this.fullName +
            "\n Position: " + this.position +
            "\n Phone: " + this.phone +
            "\n Email: " + this.email +
            "\n Salary: " + this.salary +
            "\n Age: " + this.age;

        return result;
    }
}