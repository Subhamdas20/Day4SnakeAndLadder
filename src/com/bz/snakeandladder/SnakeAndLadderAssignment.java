package com.bz.snakeandladder;
import java.util.*;
public class SnakeAndLadderAssignment {
    int dieRolled;
    static int position = 0;
    static Random random = new Random();
    public static int getRandomNumber() {              // generating random number between 1 to 6
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
    void checkOption() {
        while(position<=100){
            int getRandom = getRandomNumber();
            int randomOption = random.nextInt(3);      // // generating random options for play
            System.out.println("Number received after rolling dice is "+getRandom);

            switch (randomOption) {                //for printing positions at no play,ladder and snake
                case 0:                           //for no play
                    position = position;
                    System.out.println("Position of player at no play is " + position);
                    System.out.println("============================================================");
                    break;
                case 1:                           //for ladder
                    position = position + getRandom;
                    if(position<=100){
                        System.out.println("Position of player after climbing ladder is " + position);
                        System.out.println("============================================================");
                    }
                    else
                        System.out.println("Position of player after climbing ladder is " + (position-getRandom));
                    System.out.println("============================================================");
                    break;
                case 2:                           //for snake
                    if (position - getRandom <= 0) {
                        position = 0;
                    } else {
                        position = position - getRandom;
                        System.out.println("Position of player after stepping on snake  is " + position);
                        System.out.println("============================================================");
                    }
                    break;
            }
            if (position > 100) {                                //if position is greater than 100 it will roll back to previous value
                position = position - getRandom;
            } else if (position == 100) {
                System.out.println("Player wins");
                break;
            } else {
                position=position;
            }
            dieRolled+=1;
        }
        System.out.println("Number of times  die rolled = "+dieRolled);
        System.out.println("============================================================");
    }

    public static void main(String[] args) {

        SnakeAndLadderAssignment object1=new SnakeAndLadderAssignment();
        object1.checkOption();
    }

}