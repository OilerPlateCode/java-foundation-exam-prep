package chadJavaIntroCourse.section8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("/Users/oilerplatcode/Projects/IdeaProjects/learning/java-foundation-exam-prep/java-foundation-exam-prep/src/chadJavaIntroCourse/section8/file.txt");
            // -1 means end of file
            int character = 0;

            while ((character = fileReader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
