public class Lesson02 {
    public static void main(String[] args) {
        checkSummContainedInRange(8, 4);
        printInfoNumberSign(-1);
        isNegativeNumber(0);
        printWordInLoop("Вася", 2);
    }

    public static boolean checkSummContainedInRange(int a, int b) {
        int rangeStart = 10;
        int rangeEnd = 21;

        int summ = a + b;
        boolean isContain = (summ >= rangeStart && summ <= rangeEnd);

        return isContain;
    }

    public static void printInfoNumberSign(int number) {
        boolean isNegativeNumber = isNegativeNumber(number);
        String message;

        if (isNegativeNumber) {
            message = "This number is negative";
        } else {
            message = "This number is positive";
        }

        System.out.println(message);
    }

    public static boolean isNegativeNumber(int number) {
        boolean result = (number < 0);

        return result;
    }

    public static void printWordInLoop(String word, int totalIterations) {
        for (int currentIteration = 0; currentIteration < totalIterations; currentIteration++) {
            System.out.println(word);
        }
    }
}