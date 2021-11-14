/**
 * Java 1. Homework 3
 *
 * @author Sergey Ivenskiy
 * @version 14.10.2021
 */
import java.util.Arrays;
import java.util.Random;


public class Lesson03 {
    public static void main(String[] args) {
        // task 1
        int[] arrayBinary = getArrayRandomBinary();
        //System.out.println(Arrays.toString(arrayBinary));
        setArrayRandomBinaryAlternativeValues(arrayBinary);
        //System.out.println(Arrays.toString(arrayBinary));

        // task 2
        int[] rangefrom1To100 = getRangefrom1To100();
        // System.out.println(Arrays.toString(rangefrom1To100));

        // task 3
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        forEachMultiple(array, 2, 6);
        // System.out.println(Arrays.toString(array));

        // task 4
        int[][] twoDimensionalArray = getTwoDimensionalArray(7);
        setTwoDimensionalArrayDiagonalsValue(twoDimensionalArray, 1);
        // for (int i = 0; i < twoDimensionalArray.length; i++) {
        //     System.out.println(Arrays.toString(twoDimensionalArray[i]) + '\n');
        // }
    }


    static int[] getArrayRandomBinary()
    {
        Random random = new Random();
        int arrayLength = random.nextInt(10) + 1;
        int[] arrayBinary = new int[arrayLength];

        for (int iterate = 0; iterate < arrayLength; iterate++) {
            arrayBinary[iterate] = random.nextInt(2);
        }

        return arrayBinary;
    }


    static int[] setArrayRandomBinaryAlternativeValues(int[] arrayBinary) {
        int arrayLength = arrayBinary.length;

        for (int iterate = 0; iterate < arrayLength; iterate++) {
            int alternativeValue = (arrayBinary[iterate] == 0) ? 1 : 0;

            arrayBinary[iterate] = alternativeValue;
        }

        return arrayBinary;
    }


    static int[] getRangefrom1To100() {
        int arrayLength = 100;
        int[] array = new int[arrayLength];

        for (int iterate = 0; iterate < arrayLength; iterate++) {
            array[iterate] = iterate + 1;
        }

        return array;
    }


    static int[] forEachMultiple(int[] array, int factor, int maxMultiplicand) {
        int arrayLength = array.length;

        for (int iterate = 0; iterate < arrayLength; iterate++) {
            int currentValue = array[iterate];

            if (currentValue <= maxMultiplicand) {
                array[iterate] = currentValue * factor;
            }
        }

        return array;
    }


    static int[][] getTwoDimensionalArray(int arrayLength) {
        int[][] array = new int[arrayLength][arrayLength];

        return array;
    }


    static int[][] setTwoDimensionalArrayDiagonalsValue(int[][] array, int value) {
        int arrayLength = array.length;
        int lastIndex = arrayLength - 1;

        for (int iterate = 0; iterate < arrayLength; iterate++) {
            // Firs diagonal. Row and column are isequal to iteration.
            array[iterate][iterate] = value;

            // Second diagonal. Row is isequal to iteration. Column - traversal from end to beginning.
            int column = lastIndex - iterate;
            array[iterate][column] = value;
        }

        return array;
    }
}