package com.cypherlabs.designpatterns.structural.proxy;

//Subject class
public class RealImage implements Image{

    private String fileName = null;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Loading image from disk "+this.fileName);
    }

    public void displayImage(){
        System.out.println("Displaying image "+this.fileName);
    }
}
