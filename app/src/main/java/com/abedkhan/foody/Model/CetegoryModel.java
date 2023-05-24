package com.abedkhan.foody.Model;

public class CetegoryModel {

    public String cetegoryName;
    int cetegoryImg;


    public CetegoryModel(String cetegoryName, int cetegoryImg) {
        this.cetegoryName = cetegoryName;
        this.cetegoryImg = cetegoryImg;
    }


    public String getCetegoryName() {
        return cetegoryName;
    }

    public void setCetegoryName(String cetegoryName) {
        this.cetegoryName = cetegoryName;
    }

    public int getCetegoryImg() {
        return cetegoryImg;
    }

    public void setCetegoryImg(int cetegoryImg) {
        this.cetegoryImg = cetegoryImg;
    }
}
