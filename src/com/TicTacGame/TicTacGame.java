package com.TicTacGame;

public class TicTacGame {
    public static void main(String[] args) {

         emptyBoard();
    }

    static char[] board = new char[10];
    private static void emptyBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
}