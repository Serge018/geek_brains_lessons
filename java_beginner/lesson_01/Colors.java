public class Colors{
    public static void main(String[] args){
        printColor();
    }

    static void printColor(){
        int value = 101;
        String massage;

        if (value <= 0){
            massage = "Красный";
        } else if (value > 0 && value <= 100){
            massage = "Желтый";
        } else {
            massage = "Зеленый";
        }

        System.out.println(massage);
    }
}