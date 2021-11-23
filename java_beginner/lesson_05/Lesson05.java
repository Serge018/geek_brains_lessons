/**
 * Java 1. Homework 5
 *
 * @author Sergey Ivenskiy
 * @version 23.11.2021
 */
public class Lesson05 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John Silver", "Tech-lead", "236-01-24", "admin@mail.ru", 550000, 42),
            new Employee("Max Payne", "QA-lead", "544-13-43", "qa_support@mail.ru", 300000, 29),
            new Employee("Vladilen Minin", "Frontend-lead", "234-54-25", "minin@mail.ru", 250000, 79),
            new Employee("Ivan Ivanovich Ivanov", "Frontend Developer", "777-77-77", "ivanov1998@mail.ru", 130000, 25),
            new Employee("Dart Vayder", "Backend Developer", "003-03-03", "darkside@mail.ru", 200000, 38)
        };


        for (Employee employee : employees) {
            int employeeAge = employee.getAge();

            if (employeeAge > 40) {
                System.out.println(employee);
            }
        }
    }
}