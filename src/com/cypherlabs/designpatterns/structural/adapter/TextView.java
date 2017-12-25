package com.cypherlabs.designpatterns.structural.adapter;


import java.awt.*;

// This is adaptee class, ie it has functionality to be reused but can't be due to incompatible interfaces
public class TextView {

    public void getOrigin(Integer x, Integer y){
        // determine x,y
    }

    public void getExtent(Integer width, Integer height){
        // determine width,height
    }
}
