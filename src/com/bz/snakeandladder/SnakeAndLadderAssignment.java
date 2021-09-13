package com.bz.snakeandladder;
import java.util.*;
public class SnakeAndLadderAssignment {
    static int position = 0;
    static Random random = new Random();
    public static int getDiceRollNumber() {              // generating random number between 1 to 6
        int randomNumber = random.nextInt(6) + 1;
        return randomNumber;
    }
    void checkOption() {
            int getRandom = getDiceRollNumber();
            int randomOption = random.nextInt(3);
            System.out.println("Number received after rolling dice is"+getRandom);
            switch (randomOption) {
                case 0:
                    position = position;
                    System.out.println("Position of player at no play is " + position);
                    break;
                case 1:
                    position = position + getRandom;
                    System.out.println("Position of player after climbing ladder is " + position);
                    break;
                case 2:
                    position = position - getRandom;
                    System.out.println("Position of player after stepping on snake  is " + position);
                    break;
            }
    }
    public static void main(String[] args) {

        SnakeAndLadderAssignment object1=new SnakeAndLadderAssignment();
        object1.checkOption();
    }

}
