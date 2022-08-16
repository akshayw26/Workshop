package com.TicTacGame;

import java.util.*;

public class TicTacGame {
    public static void main(String[] args) {

        emptyBoard();
    }

    static char[] board = new char[10];
    static char playerLetter;
    static char computerLetter;

    private static void emptyBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    static void choice() {
        System.out.println(" Start the game ");
        System.out.println("Choose 'X' or 'O'");
        Scanner scan = new Scanner(System.in);
        playerLetter = scan.next().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
    }
}