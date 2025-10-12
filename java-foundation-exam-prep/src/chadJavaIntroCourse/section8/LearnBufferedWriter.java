package chadJavaIntroCourse.section8;

import java.io.*;

public class LearnBufferedWriter {

    public static void main(String[] args) throws IOException {
        String fileNameAndPath = "/Users/oilerplatecode/Projects/IdeaProjects/learning/java-foundation-exam-prep/java-foundation-exam-prep/src/chadJavaIntroCourse/section8/newFile.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameAndPath))) {
            writer.write("Eita Fede");
            writer.newLine();
            writer.write("Nig grand Mfethu");
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader bufferedReader = new BufferedReader (new FileReader(fileNameAndPath));) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
