package org.blz.SnakeAndLadder;


public class SnakeAndLadder
{
    public static int START_POSITION = 0 ;

    public static void main( String[] args )

    {
        System.out.println( "Welcome To Snake And Ladder Simulator !" );
        System.out.println("The StartingPosition Of Player Is " + START_POSITION);
        int diceNumber = (int)Math.floor(((Math.random()*10) % 7) + 1);
        System.out.println("the Dice Number Is " + diceNumber);
    }
}
