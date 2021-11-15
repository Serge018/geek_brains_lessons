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
    char[][] table;
    Scanner scanner;
    Random random;


    public static void main(String[] args) {
        new TicTacToe();
    }


    TicTacToe() {
        table = new char[SIZE][SIZE];
        scanner = new Scanner(System.in);
        random = new Random();
    }
}