package chadJavaIntroCourse.section8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnTryWithResBufferedReader {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = null;
String fileNameAndPath = "/Users/oilerplate/Projects/IdeaProjects/learning/java-foundation-exam-prep/java-foundation-exam-prep/src/chadJavaIntroCourse/section8/file.txt";
        try (BufferedReader bufferedReader = new BufferedReader (new FileReader(fileNameAndPath));) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        // We Remove the finally
    }
}
