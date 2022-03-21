package se.lexicon.dreas94;
import java.util.Scanner;

public class assignment3
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
        }

        System.out.print(digit1 + " + " + digit2 + " = " + Math.round((digit1+digit2)*100)/100 + "\n" +
                digit1 + " * " + digit2 + " = " + Math.round((digit1*digit2)*100)/100 + "\n" +
                digit1 + " / " + digit2 + " = " + Math.round((digit1/digit2)*100)/100 + "\n" +
                digit1 + " - " + digit2 + " = " + Math.round((digit1-digit2)*100)/100 + "\n");
    }
}
