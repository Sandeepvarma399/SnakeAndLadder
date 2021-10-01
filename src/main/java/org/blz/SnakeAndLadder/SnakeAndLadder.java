package org.blz.SnakeAndLadder;




public class SnakeAndLadder
{
    public static int START_POSITION = 0 ;
    public static int  NO_PLAY = 1;
    public static int LADDER = 2;
    public static int SNAKE = 3;

    public static void main( String[] args )

    {
        System.out.println( "Welcome To Snake And Ladder Simulator !" );
        System.out.println("The StartingPosition Of Player Is " + START_POSITION);
        int diceNumber = (int)Math.floor(((Math.random()*10) % 6) + 1);
        System.out.println("the Dice Number Is " + diceNumber);
        int Option = (int)Math.floor(((Math.random()*10) % 3) + 1);
        System.out.println(" the Option is " + Option );
        if (Option == 1) {
            System.out.println(" Present position Is"+ (START_POSITION + 0));
        } else if (Option == 2) {
            System.out.println("Present position Is " + (START_POSITION + diceNumber));
        } if (Option == 3) {
        System.out.println("Present position Is " + (START_POSITION  - diceNumber));
    }
    }
}
