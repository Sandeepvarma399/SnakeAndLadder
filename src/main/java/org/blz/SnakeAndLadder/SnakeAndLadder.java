package org.blz.SnakeAndLadder;


public class SnakeAndLadder {

    public static int INITIAL_POSITION = 0;
    public static int WINNING_POSITION = 100;
    public static int NO_PLAY = 1;
    public static int LADDER = 2;
    public static int SNAKE = 3;
    public static void main(String[] args) {
        int playerPosition = 0;
        int diceCount =0;
        System.out.println("Welcome To Snake And Ladder Simulator !");
        System.out.println("The StartingPosition Of Player Is " + playerPosition);
        while (playerPosition <= WINNING_POSITION) {
            int diceNumber = (int) Math.floor(((Math.random() * 10) % 6) + 1);
            System.out.println("the Dice Number Is " + diceNumber);
            int Option = (int) Math.floor(((Math.random() * 10) % 3) + 1);
            System.out.println("The Option Is " + Option);
            switch (Option) {
                case 1:
                    System.out.println("presentPosition Is" + (playerPosition + 0));
                    diceCount = diceCount++;
                    System.out.println("The Dice Count Is" +diceCount );
                    break;
                case 2:
                    System.out.println("presentPosition Is" + (playerPosition + diceNumber));
                    if ((playerPosition + diceNumber) > WINNING_POSITION) {
                        System.out.println(playerPosition = (playerPosition - diceNumber));
                    }
                    diceCount = diceCount++;
                    System.out.println("The Dice Count Is" +diceCount );
                    break;
                default:
                    System.out.println("presentPosition Is" + (playerPosition - diceNumber));
                    if ((playerPosition - diceNumber) < INITIAL_POSITION) {
                        System.out.println(playerPosition = (INITIAL_POSITION));
                        diceCount = diceCount++;
                        System.out.println("The Dice Count Is" +diceCount );
                    }
                    playerPosition++;
                    diceCount++;
            }
        }
    }
}