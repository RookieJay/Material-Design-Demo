package com.zjc.materialdesign;

/**
 * Created by ZJC on 2018-06-10.
 */

public class Fruit {

    private int imageId;

    private String fruitName;

    public Fruit( String fruitName,int imageId) {
        this.imageId = imageId;
        this.fruitName = fruitName;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
}
