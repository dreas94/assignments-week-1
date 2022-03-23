package se.lexicon.dreas94;

public class practice1
{
    private static void step1()
    {
        String firstName = "Andreas";
        System.out.println(firstName);
    }

    public static void step2()
    {
        String firstName = "Andreas";
        String lastName = "Eriksson";
        System.out.println(firstName + " " + lastName);
    }

    public static void step3()
    {
        double value1 = 0.05, value2 = 0.23;
        double result = value1 + value2;
    }

    public static void main( String[] args )
    {
        step1();
        step2();
        step3();
    }
}
