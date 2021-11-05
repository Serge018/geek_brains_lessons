public class Lesson02 {
    public static void main(String[] args) {
        checkSummContainedInRange(8, 4);
    }

    public static boolean checkSummContainedInRange(int a, int b) {
        int rangeStart = 10;
        int rangeEnd = 21;

        int summ = a + b;
        boolean isContain = (summ >= rangeStart && summ <= rangeEnd);

        return isContain;
    }
}