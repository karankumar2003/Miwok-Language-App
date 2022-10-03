package com.example.android.miwok;

public class Word {
    private String  mMiwokTranslation;
    private String  mDefaultTranslation;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId , int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId= imageResourceId;
        mAudioResourceId = audioResourceId;
    }



    Word(String defaultTranslation, String miwokTranslation,int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }


    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
       return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){
        return mAudioResourceId;
    }
}
