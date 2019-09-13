package com.example.android.miwok;

public class Word {

    private String mMiwokWord;
    private String mDefaultWord;

    public Word(String miwokWord, String defaultWord){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }
}
