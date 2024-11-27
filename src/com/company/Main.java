package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    static void checkFileExists() {

        Path path = Paths.get("d:\\000");
        String xlsFile = "\\month.xlsx";
        File tmpFile = new File(path + xlsFile);
        boolean exists = tmpFile.exists();
        if (exists) {
            System.out.println("File is there");

        } else {
            System.out.println(path + xlsFile);

        }

    }

    public static void main(String[] args) throws IOException {
        checkFileExists();
        System.out.println("it works");
    }
}


