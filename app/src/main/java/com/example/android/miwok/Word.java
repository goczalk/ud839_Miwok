package com.example.android.miwok;

/**
 * Created by klaudia on 27/04/18.
 */

public class Word {
    private String defaultTranslation;
    private String miwokTranlation;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private int mp3ResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranlation, int mp3ResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranlation = miwokTranlation;
        this.mp3ResourceId = mp3ResourceId;
    }

    public Word(String defaultTranslation, String miwokTranlation, int imageResourceId, int mp3ResourceId) {
        this(defaultTranslation, miwokTranlation, mp3ResourceId);
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

    public int getMp3ResourceId() {
        return mp3ResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
