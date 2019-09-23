package com.example.android.miwok;

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageResourceId = -1;

    public Word(String defaultWord, String miwokWord){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getImageResourceId() { return mImageResourceId; }
}
