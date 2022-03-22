package se.lexicon.dreas94;
import java.util.*;

public class assignment8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int answer = rand.nextInt(500);
        Vector<Integer> guesses = new Vector<>(500);

        System.out.println("A random number between 1-500 has been decided, guess the right number!");

        while(guesses.size() == 0 || guesses.get(guesses.size()-1) != answer)
        {
            System.out.print("Guess: ");
            int currentGuess;
            if(sc.hasNextInt())
            {
                currentGuess = sc.nextInt();

                for(int guess : guesses)
                {
                    if(guess == currentGuess)
                    {
                        System.out.println("You have already attempted this guess try again!");
                        sc.nextLine();
                        currentGuess = -1;
                        break;
                    }
                }
                if(currentGuess == -1)
                {
                    continue;
                }
                else
                {
                    guesses.add(currentGuess);
                }

                if(currentGuess > answer)
                {
                    System.out.println("Your guess was too big");
                }
                else if(currentGuess < answer)
                {
                    System.out.println("Your guess was too small");
                }
                else
                {
                    System.out.println("Your guess is correct!");
                    System.out.println("You guessed " + guesses.size() + " times");
                    System.out.print("These were your guesses: ");

                    for(int guess : guesses)
                    {
                        System.out.print(guess + " ");
                    }
                }
            }
        }


    }
}
