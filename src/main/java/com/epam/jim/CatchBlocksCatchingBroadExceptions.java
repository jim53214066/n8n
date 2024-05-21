package com.epam.jim;

import java.io.File;

public class CatchBlocksCatchingBroadExceptions {
    public void processFile(String filePath) {
        try {
            File file = new File(filePath);
            // Other file processing logic...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
