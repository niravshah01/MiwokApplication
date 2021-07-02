package com.example.prectapp;

public class Word {
    private String mdefaultTranslation;
    private String mgujTranslation;
    private int mImageResourceId;
    private int maudioResourceId;

    public Word(String defaultTranslation,String gujTranslation, int audioResourceId){
        mdefaultTranslation = defaultTranslation;
        mgujTranslation = gujTranslation;
        maudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation,String gujTranslation,int imageResourceId, int audioResourceId){
        mdefaultTranslation = defaultTranslation;
        mgujTranslation = gujTranslation;
        mImageResourceId = imageResourceId;
        maudioResourceId = audioResourceId;
    }

    public String getdefaultTranslation(){
        return mdefaultTranslation;
    }

    public String getgujTranslation() {
        return mgujTranslation;
    }

    public int getImageResourceID(){ return mImageResourceId; }

    public int getaudioResourceID(){ return maudioResourceId; }
}
