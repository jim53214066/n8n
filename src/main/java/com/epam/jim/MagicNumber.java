package com.epam.jim;

public class MagicNumber {
    public void resizeWindow(float width, float height) {
        float aspectRatio = width / height;

        if (aspectRatio < 1.33) {
            // Perform operation for low aspect ratio
        } else if (aspectRatio < 1.77) {
            // Perform operation for medium aspect ratio
        }
    }
}
