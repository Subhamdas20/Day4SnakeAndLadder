package com.bz.snakeandladder;

import java.util.Random;

public class SnakeAndLadderAssignment {
    static int dieRolled;
    int position = 0;
    int position1 = 0;
    int position2 = 0;
    static Random random = new Random();

    public static int getDiceRollNumber() {              // generating random number between 1 to 6
        int randomNumber = random.nextInt(6) + 1;
        dieRolled += 1;
        return randomNumber;
    }

    public int startPlay(int position) {
        this.position = position;
        int getRandom = getDiceRollNumber();
        int randomOption = random.nextInt(3);      // // generating random options for play
        System.out.println("Number received after rolling dice is " + getRandom);
        switch (randomOption) {                //for printing positions at no play,ladder and snake
            case 0:                           //for no play
                position = this.position;
                System.out.println("Position of player at no play is " + position);
                break;
            case 1:                           //for ladder
                position = position + getRandom;
                int bonusPlayLadder = getDiceRollNumber();
                if (position <= 100) {
                    System.out.println("Position of player2 after climbing ladder is " + position);
                    if ((position + bonusPlayLadder) <= 100) {// bonus play after getting ladder for player
                        position = position + bonusPlayLadder;
                        System.out.println("Player2 gets bonus point of " + bonusPlayLadder);
                        System.out.println("Position of player2 after climbing bonus  ladder is " + (position));
                    } else
                        System.out.println("Position of player2 after climbing bonus ladder is " + (position));
                } else
                    position = position - getRandom;
                System.out.println("Position of player2 after climbing ladder is " + (position));
                System.out.println("============================================================");
                break;
            case 2:                           //for snake
                if (position - getRandom <= 0) {
                    position = 0;
                } else {
                    position = position - getRandom;
                    System.out.println("Position of player after stepping on snake  is " + position);
                }
                break;
        }
        return position;
    }

    public void checkWinner(SnakeAndLadderAssignment obj) {
        while (position1 <= 100 || position2 <= 100) {
            position1 = obj.startPlay(position1);
            System.out.println("Player1 position is : " + position1);
            System.out.println("============================================================");
            if (position1 == 100) {
                System.out.println("Player 1 winner");
                break;
            }
            position2 = obj.startPlay(position2);
            System.out.println("Player2 position is : " + position2);
            System.out.println("============================================================");
            if (position2 == 100) {
                 System.out.println("Player 2 winner");
                break;
            }
        }
        System.out.println("Number of times  die rolled = " + dieRolled);
        System.out.println("============================================================");
    }

    public static void main(String[] args) {
        SnakeAndLadderAssignment obj = new SnakeAndLadderAssignment();
        obj.checkWinner(obj);
    }
}
