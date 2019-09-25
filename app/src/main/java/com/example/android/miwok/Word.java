package com.example.android.miwok;

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageResourceId = -1;
    private int mPronounciationId;

    public Word(String defaultWord, String miwokWord, int pronounciation){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mPronounciationId = pronounciation;
    }

    public Word(String defaultWord, String miwokWord, int imageResourceId, int pronounciation){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mImageResourceId = imageResourceId;
        mPronounciationId = pronounciation;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public int getPronounciationId(){return mPronounciationId;}
}
