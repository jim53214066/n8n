package com.epam.jim;

public class MagicNumber {
    private static final float LOW_ASPECT_RATIO_THRESHOLD = 1.33f;
    private static final float MEDIUM_ASPECT_RATIO_THRESHOLD = 1.77f;

    public void resizeWindow(float width, float height) {
        float aspectRatio = width / height;

        if (aspectRatio < LOW_ASPECT_RATIO_THRESHOLD) {
            // Perform operation for low aspect ratio
        } else if (aspectRatio < MEDIUM_ASPECT_RATIO_THRESHOLD) {
            // Perform operation for medium aspect ratio
        }
    }
}