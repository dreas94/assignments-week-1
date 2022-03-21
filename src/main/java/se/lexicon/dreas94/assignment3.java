package se.lexicon.dreas94;
import java.util.Scanner;

public class assignment3
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first digit: ");
        double digit1 = sc.nextDouble();
        System.out.print("Enter second digit: ");
        double digit2 = sc.nextDouble();

        System.out.print(digit1 + " + " + digit2 + " = " + (digit1+digit2) + "\n");
        System.out.print(digit1 + " * " + digit2 + " = " + (digit1*digit2) + "\n");
        System.out.print(digit1 + " / " + digit2 + " = " + (digit1/digit2) + "\n");
        System.out.print(digit1 + " - " + digit2 + " = " + (digit1-digit2) + "\n");
    }
}
