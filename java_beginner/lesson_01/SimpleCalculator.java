public class SimpleCalculator{
    public static void main(String[] args){
        checkSumSign();
    }

    static void checkSumSign(){
        int a = 1;
        int b = 2;
        int summ = a + b;
        String massage;

        if (summ > 0){
            massage = "Сумма положительная";
        } else if (summ < 0){
            massage = "Сумма отрицательная";
        } else {
            massage = "Сумма ровна нулю";
        }

        System.out.println(massage);
    }   
}