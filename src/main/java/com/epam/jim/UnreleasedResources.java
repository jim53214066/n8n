package com.epam.jim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UnreleasedResources {
    public String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        return content.toString();
    }
}
