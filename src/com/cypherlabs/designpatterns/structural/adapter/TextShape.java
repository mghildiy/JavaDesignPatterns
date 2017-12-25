package com.cypherlabs.designpatterns.structural.adapter;

import java.awt.*;

// This is the adapter class. It uses inheritance to make use of Adaptee functionality.
public class TextShape extends TextView implements Shape {
    @Override
    public void BoundingBox(Point bottomLeft, Point topRight) {
        Integer x=0,y=0,width=0,height=0;
        getOrigin(x,y);
        getExtent(width,height);

        bottomLeft = new Point(x,y);
        topRight = new Point(x+width,y+height);
    }
}
