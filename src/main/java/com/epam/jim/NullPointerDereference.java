package com.epam.jim;

import java.util.List;

public class NullPointerDereference {
    public void printData(List<String> data) {
        if (data != null && !data.isEmpty()) {
            for (String value : data) {
                System.out.println(value);
            }
        }
    }
}