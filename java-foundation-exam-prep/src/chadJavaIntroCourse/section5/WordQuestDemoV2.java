package chadJavaIntroCourse.section5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemoV2 {
    public static void main(String[] args) {

        String fileName = "data/sample.txt";
        String secretWord = getRandomWord(fileName);

        int maxAttempts = 10;
        char[] gameBoard = new char[secretWord.length()];
        final char EMPTY_PLACEHOLDER = '-';
        Arrays.fill(gameBoard, EMPTY_PLACEHOLDER);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the word quest!");
        boolean hasMissingLetters = true;

        // Main game loop runs while there are attempts left and while the word is not solved
        while (maxAttempts > 0 && hasMissingLetters) {
            System.out.println("Current word: ");
            System.out.println(gameBoard);

            System.out.println();
            System.out.println("Guess the letter: ");

            String userInput = scanner.nextLine().toUpperCase();
            char guess = userInput.charAt(0);

            boolean isGuessCorrect = false;

            for (int i = 0; i < secretWord.length(); i++) {
                    if (guess == secretWord.charAt(i)) {
                        gameBoard[i] = guess;
                        isGuessCorrect = true;
                    }

                    if (isGuessCorrect) {
                        System.out.println("Good job! You found a match.");

                        hasMissingLetters = contains(gameBoard, EMPTY_PLACEHOLDER);
                    } else {
                        System.out.println("You entered an incorrect letter.");
                        maxAttempts--;
                    }
                System.out.println("Guesses left: " + maxAttempts);
                System.out.println();

                if(hasMissingLetters) {
                    System.out.println("You have ran out of attempts. The secret word was: " + secretWord);
                } else {
                    System.out.println("You won, you successfully guessed the word: " + secretWord);
                }
            }
        }
        scanner.close();
    }

    private static boolean contains(char[] gameBoard, char EMPTY_PLACEHOLDER) {
        for (char temp: gameBoard) {
            if (temp == EMPTY_PLACEHOLDER) {
                return true;
            }
        }
        return false;
    }

    private static String getRandomWord(String fileName) throws IOException {
//        String[] words = {"Nissan", "Isuzu", "Jeep"};
        List<String> linesList = Files.readAllLines(Paths.get(fileName));
        Random rand = new Random();
        int index = rand.nextInt(words.length); // 0-2 our array has 3 items so its cool

        String theWord = words[index];
        return theWord.toUpperCase();
    }
}
