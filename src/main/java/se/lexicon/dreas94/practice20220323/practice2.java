package se.lexicon.dreas94.practice20220323;

public class practice2
{
    private static void step1()
    {
        Car volvo = new Car("Volvo", 123456, 120, "Andreas", 1994);
    }

    private static void step2()
    {
        int score = 64;

        if(score >= 65)
        {
            System.out.println("Hurray, You passed!");
        }
        else if(score >= 55)
        {
            System.out.println("You are almost there.");
        }
        else
        {
            System.out.println("Sorry, You did not pass.");
        }
    }

    public static void main(String[] args)
    {
        step1();
        step2();
    }
}
