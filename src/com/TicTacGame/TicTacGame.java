package com.TicTacGame;

import java.util.*;

public class TicTacGame {

    public static void main(String[] args) {



        emptyBoard();
        choice();
        printBoard();
        makeMove();

    }

    static char[] board = new char[10];

    static Scanner sc = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;

    private static void emptyBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    static void choice() {
        System.out.println("Choose your letter X or O");
        playerLetter = sc.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("Your letter is: " + playerLetter);
        System.out.println("computer letter is: " + computerLetter);
    }

    static void printBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---------- ");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println("----------");
    }

    static void makeMove() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter location from 1 to 9 ");
        int location = scan.nextInt();
        if (location < 1 && location > 10) {
            System.out.println("Enter valid location");
        } else if (board[location] != ' ') {
            System.out.println("You have already chosen this location, Please enter valid location");
            makeMove();
        } else {
            board[location] = playerLetter;
            printBoard();
            makeMove();

        }
    }


}
