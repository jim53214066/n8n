package com.epam.jim;

import java.io.File;
import java.io.IOException;

public class CatchBlocksCatchingBroadExceptions {
    public void processFile(String filePath) {
        try {
            File file = new File(filePath);
            // Other file processing logic...
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}