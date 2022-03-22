package se.lexicon.dreas94;
import java.util.Scanner;

public class assignment7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = -1;

        while(seconds == -1)
        {
            seconds = in.nextInt();
        }

        int remainingSeconds = seconds % 60;
        int hours = seconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.print( hours + ":" + minutes + ":" + remainingSeconds);
        System.out.print("\n");
    }
}
