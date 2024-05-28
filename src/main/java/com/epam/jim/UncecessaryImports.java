package com.epam.jim;

import java.io.File;

public class UnnecessaryImports {

    public void processFile(File file) {
        System.out.println("input file: " + ((file == null) ? "Null" : file.getName()));
    }
}