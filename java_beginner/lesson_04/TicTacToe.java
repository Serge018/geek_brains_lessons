/**
 * Java 1. Homework 4
 *
 * @author Sergey Ivenskiy
 * @version 15.10.2021
 */
import java.util.Scanner;
import java.util.Random;


public class TicTacToe {
    final int SIZE = 3;
    final int WIN_SIZE = 3;
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    final String MSG_FOR_HUMAN = "Enter X and Y [1..3]:";
    final String MSG_YOU_WON = "You won!";
    final String MSG_AI_WON = "AI won!";
    final String MSG_DRAW = "Sorry, draw!";
    final String MSG_GAME_OVER = "Game over.";
    final char[][] table;
    Scanner scanner;
    Random random;


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }


    TicTacToe() {
        table = new char[SIZE][SIZE];
        scanner = new Scanner(System.in);
        random = new Random();
    }


    void play() {
        initTable();
        printTable();

        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println(MSG_YOU_WON);
                break;
            }
            if (isTableFull()) {
                System.out.println(MSG_DRAW);
                break;
            }

            turnAI();
            if (checkWin(SIGN_O)) {
                System.out.println(MSG_AI_WON);
                break;
            }
            if (isTableFull()) {
                System.out.println(MSG_DRAW);
                break;
            }
        }

        System.out.println(MSG_GAME_OVER);
        printTable();
    }


    void initTable() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                table[row][column] = SIGN_EMPTY;
            }
        }
    }


    void printTable() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                System.out.print(table[row][column] + " ");
            }
            System.out.println();
        }
    }


    void turnHuman() {

    }


    void turnAI() {

    }


    boolean isTableFull() {
        for (int row = 0; row < SIZE; row++) {
            for (int column = 0; column < SIZE; column++) {
                if (table[row][column] == SIGN_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }


    boolean checkWin(char sign) {
        String patternWin = getPatternWin(sign);
        boolean result = (checkRows(sign, patternWin) || checkColumns(sign, patternWin) || checkDiagonals(sign, patternWin));

        return result;
    }


    boolean checkRows(char sign, String patternWin) {

        return false;
    }


    boolean checkColumns(char sign, String patternWin) {

        return false;
    }


    boolean checkDiagonals(char sign, String patternWin) {

        return true;
    }


    String getPatternWin(char sign) {
        String pattern = "";

        return pattern;
    }
}