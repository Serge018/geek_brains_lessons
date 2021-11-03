public class SimpleCalculator{
    public static void main(String[] args){
        checkSumSign();
    }

    static void checkSumSign(){
        int a = 1;
        int b = 2;
        int summ = a + b;

        String massage = (summ <= 0? "Сумма положительная" : "Сумма отрицательная");

        System.out.println(massage);
    }
}