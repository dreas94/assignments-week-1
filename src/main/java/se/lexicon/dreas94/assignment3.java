package se.lexicon.dreas94;
import java.util.Scanner;

public class assignment3
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        double digit1 = 1;
        double digit2 = 2;

        System.out.print(
                digit1 + " + " + digit2 + " = " + (digit1+digit2) + "\n" +
                digit1 + " * " + digit2 + " = " + (digit1*digit2) + "\n" +
                digit1 + " / " + digit2 + " = " + (digit1/digit2) + "\n" +
                digit1 + " - " + digit2 + " = " + (digit1-digit2) + "\n");
    }
}
