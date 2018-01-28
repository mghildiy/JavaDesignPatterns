package com.cypherlabs.designpatterns.structural.proxy;

//Proxy
public class ProxyImage implements Image{

    private RealImage image = null;
    private String filename = null;

    public ProxyImage(final String filename) {
        this.filename = filename;
    }

    //we use conditional access to RealImage
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

}
