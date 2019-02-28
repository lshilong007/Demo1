package com.example.demo.entity;

public class Music {
   private Integer mscid;
   private String title;
   private String singer;
   private String special;
   private String mscvalue;
   private String msctime;
   private Integer click;
   private String url;

    public Integer getMscid() {
        return mscid;
    }

    public void setMscid(Integer mscid) {
        this.mscid = mscid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getMscvalue() {
        return mscvalue;
    }

    public void setMscvalue(String mscvalue) {
        this.mscvalue = mscvalue;
    }

    public String getMsctime() {
        return msctime;
    }

    public void setMsctime(String msctime) {
        this.msctime = msctime;
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Music{" +
                "mscid=" + mscid +
                ", title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                ", special='" + special + '\'' +
                ", mscvalue='" + mscvalue + '\'' +
                ", msctime='" + msctime + '\'' +
                ", click=" + click +
                ", url='" + url + '\'' +
                '}';
    }
}
