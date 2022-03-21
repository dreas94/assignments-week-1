package se.lexicon.dreas94;
import java.util.*;

public class assignment4
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter amount of variables:");
        Vector<Double> digits = new Vector<>(0);
        while(digits.capacity() == 0)
        {
            if (sc.hasNextInt())
            {
                int num = sc.nextInt();
                digits.ensureCapacity(num);
            }
        }

        int index = 0;
        while(index < digits.capacity())
        {
            for(; index < digits.capacity(); index++)
            {
                System.out.print("Enter digit " + (index + 1) + ": ");
                if (sc.hasNextDouble())
                {
                    digits.add(sc.nextDouble());
                }
                else
                {
                    sc.nextLine();
                    System.out.print("Incorrect input, try again!\n");
                    sc.nextLine();
                    break;
                }
            }
        }
        double result = 0;
        String output = "";
        for(int i = 0; i < digits.size(); i++)
        {
            result += digits.get(i);
            if(i == 0)
            {
                output = output.concat("(" + digits.get(i));
            }
            else if(i == digits.size()-1)
            {
                output = output.concat(" + " + digits.get(i) + ") / " + digits.size() + " = " + Math.round((result/(double)digits.size()*100))/100);
            }
            else
            {
                output = output.concat(" + " + digits.get(i));
            }
        }
        System.out.println(output);
    }
}