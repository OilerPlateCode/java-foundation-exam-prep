package chadJavaIntroCourse.section5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordQuestDemo {
    public static void main(String[] args) {
        String secretWord = getRandomWord();

        int maxAttempts = 10;
        char[] gameBoard = new char[secretWord.length()];

        Arrays.fill(gameBoard, '_');

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the word quest!");
        boolean wordNotRevealed = false;

        // Main game loop runs while there are attempts left and while the word is not solved
        while (maxAttempts > 0 && wordNotRevealed) {
            System.out.println("Current word: ");
            System.out.println(gameBoard);

            System.out.println();
            System.out.println("Guess the letter: ");

            String userInput = scanner.nextLine().toUpperCase();
            char guess = userInput.charAt(0);
        }
    }

    private static String getRandomWord() {
        String[] words = {"Nissan", "Isuzu", "Jeep"};

        Random rand = new Random();
        int index = rand.nextInt(words.length); // 0-2 our array has 3 items so its cool

        String theWord = words[index];
        return theWord.toUpperCase();
    }
}
