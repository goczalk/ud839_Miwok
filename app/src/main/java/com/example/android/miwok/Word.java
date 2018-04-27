package com.example.android.miwok;

/**
 * Created by klaudia on 27/04/18.
 */

public class Word {
    private String defaultTranslation;
    private String miwokTranlation;

    public Word(String defaultTranslation, String miwokTranlation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
    }

    public String getMiwokTranlation() {
        return miwokTranlation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
