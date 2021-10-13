package com.bz.snakeandladder;
import java.util.*;
public class SnakeAndLadderAssignment {
    static int dieRolled;
    static int position = 0;
    static int position2 = 0;
    static Random random = new Random();

    public static int getRandomNumber() {              // generating random number between 1 to 6
        int randomNumber = random.nextInt(6) + 1;
        dieRolled+=1;
        return randomNumber;
    }

    void checkOption() {
        while ((position <= 100) || (position2 <= 100)) {
            int getRandom = getRandomNumber();
            int randomOption = random.nextInt(3);      // // generating random options for play
            System.out.println("Number received after rolling dice is " + getRandom);
            int switchPlayers = dieRolled % 2;
            switch (switchPlayers) {
                case 0:                                     //for player 1
                    switch (randomOption) {                //for printing positions at no play,ladder and snake
                        case 0:                           //for no play
                            position = position;
                            System.out.println("Position of player1 at no play is " + position);
                            System.out.println("============================================================");
                            break;
                        case 1:                           //for ladder
                            position = position + getRandom;
                            int bonusPlayLadder = getRandomNumber();
                            if (position <= 100) {
                                System.out.println("============================================================");
                                System.out.println("Position of player1 after climbing ladder   is " + position);
                                if ((position + bonusPlayLadder) <= 100) {                                                    //for bonus play after getting ladder
                                    System.out.println("Player1 gets bonus point of " + bonusPlayLadder);
                                    System.out.println("Position of player1 after climbing bonus  ladder is " + (position = position + bonusPlayLadder));
                                } else
                                    System.out.println("Player1 gets bonus point of " + bonusPlayLadder);
                                System.out.println("Position of player1 after climbing bonus  ladder is " + (position));
                            } else
                                position = position - getRandom;
                            System.out.println("Position of player1 after climbing ladder is " + (position));
                            System.out.println("============================================================");
                            break;
                        case 2:                           //for snake
                            if (position - getRandom <= 0) {
                                position = 0;
                            } else {
                                position = position - getRandom;
                                System.out.println("Position of player1 after stepping on snake  is " + position);
                                System.out.println("============================================================");
                            }
                            break;
                    }
                    break;
                case 1:                                     //for player 2
                    switch (randomOption) {                //for printing positions at no play,ladder and snake
                        case 0:                           //for no play
                            position2 = position2;
                            System.out.println("Position of player2 at no play is " + position2);
                            System.out.println("============================================================");
                            break;
                        case 1:                                                  //for ladder
                            position2 = position2 + getRandom;
                            int bonusPlayLadder = getRandomNumber();
                            if (position2 <= 100) {
                                System.out.println("============================================================");
                                System.out.println("Position of player2 after climbing ladder is " + position2);
                                if ((position2 + bonusPlayLadder) <= 100) {                                                  // bonus play after getting ladder for player 2
                                    System.out.println("Player2 gets bonus point of " + bonusPlayLadder);
                                    System.out.println("Position of player2 after climbing bonus  ladder is " + (position2 = position2 + bonusPlayLadder));
                                } else
                                    System.out.println("Position of player2 after climbing bonus ladder is " + (position2));
                            } else
                                position2 = position2 -getRandom;
                                System.out.println("Position of player2 after climbing ladder is " + (position2));
                            System.out.println("============================================================");
                            break;
                        case 2:                           //for snake
                            if (position2 - getRandom <= 0) {
                                position2 = 0;
                            } else {
                                position2 = position2 - getRandom;
                                System.out.println("Position of player2 after stepping on snake  is " + position2);
                                System.out.println("============================================================");
                            }
                            break;
                    }
                    break;
            }
           if (position == 100) {
                System.out.println("Player1 wins");
                break;
            }
           if (position2 == 100) {
               System.out.println("Player2 wins");
               break;
               }
            }
        }

        public static void main (String[]args){
            SnakeAndLadderAssignment object1 = new SnakeAndLadderAssignment();
            object1.checkOption();
            System.out.println("Number of times  die rolled = " + dieRolled);
        }

    }
