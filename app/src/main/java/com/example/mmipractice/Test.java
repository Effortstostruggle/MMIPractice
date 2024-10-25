package com.example.mmipractice;

public class Test {
    private String name;
    private int imageId;

    public Test(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
