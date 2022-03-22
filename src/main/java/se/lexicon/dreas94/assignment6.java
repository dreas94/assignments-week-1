package se.lexicon.dreas94;
import java.util.Scanner;

public class assignment6
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        double digit1 = 0;
        double digit2 = 0;

        boolean foundNumbers = false;

        while(!foundNumbers)
        {
            System.out.print("Enter first digit: ");
            if(sc.hasNextDouble())
            {
                digit1 = sc.nextDouble();
                System.out.print("Enter second digit: ");
                if(sc.hasNextDouble())
                {
                    digit2 = sc.nextDouble();
                }
                foundNumbers = true;
            }

            if(!foundNumbers)
            {
                System.out.print("You did something wrong, try again!\n");
                sc.nextLine();
            }
        }

        System.out.print(
                digit1 + " + " + digit2 + " = " + (digit1+digit2) + "\n" +
                digit1 + " * " + digit2 + " = " + (digit1*digit2) + "\n" +
                digit1 + " / " + digit2 + " = " + (digit1/digit2) + "\n" +
                digit1 + " - " + digit2 + " = " + (digit1-digit2) + "\n");
    }
}
