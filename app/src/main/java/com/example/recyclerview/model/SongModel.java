package com.example.recyclerview.model;

import java.io.Serializable;

public class SongModel implements Serializable {
    private String mCode;
    private String mTitle;
    private String mLyric;
    private String mArtist;

    public SongModel(String code, String title, String lyric, String artist) {
        mCode = code;
        mTitle = title;
        mLyric = lyric;
        mArtist = artist;
    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getmLyric() {
        return mLyric;
    }

    public void setmLyric(String mLyric) {
        this.mLyric = mLyric;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmCode() {
        return mCode;
    }

    public void setmCode(String mCode) {
        this.mCode = mCode;
    }
}
