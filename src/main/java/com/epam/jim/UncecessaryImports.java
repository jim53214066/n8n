package com.epam.jim;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

public class UncecessaryImports {


    public void processFile(File file) {
        System.out.println("input file: " + ((file == null) ? "Null" : file.getName()));
    }
}
