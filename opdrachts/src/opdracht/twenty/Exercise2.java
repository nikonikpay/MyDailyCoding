package opdracht.twenty;

import java.util.*;
import java.util.stream.IntStream;

public class Exercise2
    {
    public static void main(String[] args)
        {
//        Scanner scanner = new Scanner(System.in);
//        Set<Integer> mySetOfInteger = new HashSet<>();
//        System.out.println("Enter number between 1-45");
//        int userInput;
//
//        for (int i = 0; mySetOfInteger.size() <6 ; i++){
//                userInput = scanner.nextInt();
//                mySetOfInteger.add(userInput);
//        }
//        System.out.println(mySetOfInteger);

        // Second way
        Scanner scanner = new Scanner(System.in);
        Set<Integer> userGuesses = new HashSet<>();

        while (userGuesses.size() < 6)
            {
            int userGuess = scanner.nextInt();
            if (userGuess >= 1 && userGuess <= 45)
                {
                userGuesses.add(userGuess);
                }
            }
        userGuesses.forEach(System.out::println);


        // Random Practice
        Set<Integer> randomSet = new HashSet<>();
        for (int i = 0; randomSet.size() < 6; i++)
            {
            int random = new Random().ints(6, 1, 45).findFirst().getAsInt();
            randomSet.add(random);
            }
        System.out.println(randomSet);

        }


    }
