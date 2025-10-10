package chadJavaIntroCourse.section8;

import java.io.FileReader;

public class FileInputExceptions {
    public static void main(String[] args) {
        try {
    FileReader fileReader = new FileReader("file.txt");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
