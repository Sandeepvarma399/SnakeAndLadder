package org.blz.SnakeAndLadder;


public class SnakeAndLadder {
    public static int START_POSITION = 0;
    public static int INITIAL_POSITION = 0;
    public static int WINNING_POSITION = 100;
    public static int NO_PLAY = 1;
    public static int LADDER = 2;
    public static int SNAKE = 3;


    public static void main(String[] args) {
        int presentPosition = 0;
        int nextPosition;
        System.out.println("Welcome To Snake And Ladder Simulator !");
        System.out.println("The StartingPosition Of Player Is " + START_POSITION);

        while (START_POSITION <= WINNING_POSITION) {
            int diceNumber = (int) Math.floor(((Math.random() * 10) % 6) + 1);
            System.out.println("the Dice Number Is " + diceNumber);
            int Option = (int) Math.floor(((Math.random() * 10) % 3) + 1);
            System.out.println("The Option Is " + Option);
            switch (Option) {
                case 1:
                    System.out.println("presentPosition Is" + (START_POSITION + 0));
                    break;
                case 2:
                    System.out.println("presentPosition Is" + (START_POSITION + diceNumber));
                    if ((START_POSITION + diceNumber) > WINNING_POSITION) {
                        System.out.println(START_POSITION = (START_POSITION - diceNumber));
                    }
                    break;
                default:
                    System.out.println("presentPosition Is" + (START_POSITION - diceNumber));
                    if ((START_POSITION - diceNumber) < INITIAL_POSITION) {
                        System.out.println(START_POSITION = (INITIAL_POSITION));
                    }
            }
            START_POSITION++;
        }
    }
}