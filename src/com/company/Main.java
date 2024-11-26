package com.company;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Main {
    static void myFunc() {
        File tmpFile = new File("d:\\000\\test.txt");
        boolean exists = tmpFile.exists();
        if (exists) {
            System.out.println("File is there");

        } else {
            System.out.println("the file is not there");

        }

    }

    public static void main(String[] args) throws IOException {
        myFunc();
        System.out.println("it works");
    }
}


