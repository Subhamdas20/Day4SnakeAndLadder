package com.bz.snakeandladder;
import java.util.*;
public class SnakeAndLadderAssignment {
    static int position = 0;

    void startGame() {
        System.out.println("Position of player at start is " + position);
    }
    void getRandomNumber() {
        Random random = new Random();
        int randomNumber = 1;
        if (randomNumber > 0) {
            randomNumber = random.nextInt(7);
            System.out.println(randomNumber);
        }
    }
    public static void main(String[] args) {
        SnakeAndLadderAssignment object1=new SnakeAndLadderAssignment();
        object1.startGame();
        object1.getRandomNumber();
    }
}
