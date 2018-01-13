package com.cypherlabs.designpatterns.structural.bridge;

public class BridgePatternDemo {

    public static void main(String[] args){

        Shape shapeImpl = new ShapeImpl(new DrawAPIImpl1());
        shapeImpl.draw();

        shapeImpl = new ShapeImpl(new DrawAPIImpl2());
        shapeImpl.draw();

    }
}
