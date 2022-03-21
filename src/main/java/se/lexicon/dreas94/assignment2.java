package se.lexicon.dreas94;
import java.util.*;

public class assignment2
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        String response;
        if(year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0))
        {
            response = " is a Leap year";
        }
        else
        {
            response = " is NOT a Leap year";
        }

        System.out.print(year + response);
    }
}
