public class SimpleCalculator{
    public static void main(String[] args){
        checkSumSign();
        compareNumbers();
    }

    static void checkSumSign(){
        int a = 1;
        int b = 2;
        int summ = a + b;

        String massage = (summ <= 0? "Сумма положительная" : "Сумма отрицательная");

        System.out.println(massage);
    }

    static void compareNumbers(){
        int a = 2;
        int b = 2;

        String operator = (a >= b? " >= " : " < ");
        String message = "a" + operator + "b";

        System.out.println(message);
    }
}