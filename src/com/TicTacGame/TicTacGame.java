package com.TicTacGame;

import java.util.*;

public class TicTacGame {
    public static void main(String[] args) {

        emptyBoard();
        choice();
        printBoard();
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
        System.out.println("Your letter is: "+playerLetter);
        System.out.println("computer letter is: "+computerLetter);
    }
    static void printBoard(){
        System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
        System.out.println("----------");
        System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
        System.out.println("---------- ");
        System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
        System.out.println("----------");
   }

}