package chadJavaIntroCourse.section8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileInputExceptions {
    public static void main(String[] args) {
        try {
    FileReader fileReader = new FileReader("file.txt");
            oneWithMethodSignature();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void oneWithMethodSignature() throws FileNotFoundException {
        FileReader fileReader = new FileReader("otherFile.txt");
    }
}
