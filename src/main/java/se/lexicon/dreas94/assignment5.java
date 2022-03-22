package se.lexicon.dreas94;

import java.sql.SQLOutput;
import java.util.Scanner;

public class assignment5
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");

        String userName = "";

        while(userName.equals(""))
        {
            if (sc.hasNextLine())
            {
                userName = sc.nextLine();
            } else
            {
                System.out.print("You did something wrong, try again!\n");
                sc.nextLine();
            }
        }
        System.out.println("Hello " + userName);
    }
}
