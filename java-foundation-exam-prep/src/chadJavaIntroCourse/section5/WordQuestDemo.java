package chadJavaIntroCourse.section5;

import java.util.Random;

public class WordQuestDemo {
    public static void main(String[] args) {
        String secretWord = getRandomWord();
    }

    private static String getRandomWord() {
        String[] words = {"Nissan", "Isuzu", "Jeep"};

        Random rand = new Random();
        int index = rand.nextInt(words.length); // 0-2 our array has 3 items so its cool

        String theWord = words[index];
        return theWord.toUpperCase();
    }
}
