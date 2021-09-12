package com.bz.snakeandladder;

public class SnakeAndLadderAssignment {
    static int position = 0;

    void startGame() {
        System.out.println("Position of player at start is " + position);
    }
    public static void main(String[] args) {
        SnakeAndLadderAssignment object1=new SnakeAndLadderAssignment();
        object1.startGame();
    }
}
