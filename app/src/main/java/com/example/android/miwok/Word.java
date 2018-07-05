package com.example.android.miwok;

/**
 * Created by klaudia on 27/04/18.
 */

public class Word {
    private String defaultTranslation;
    private String miwokTranlation;
    private int imageResourceId;

    public Word(String defaultTranslation, String miwokTranlation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
    }

    public Word(String defaultTranslation, String miwokTranlation, int imageResourceId) {
        this(defaultTranslation, miwokTranlation);
        this.imageResourceId = imageResourceId;
    }

    public String getMiwokTranlation() {
        return miwokTranlation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
