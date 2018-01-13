package com.cypherlabs.designpatterns.structural.bridge;

public class ShapeImpl extends Shape {

    public ShapeImpl(DrawAPI drawAPI){
        super(drawAPI);
    }

    @Override
    public void draw() {
        //delegate draw functionality to bridge interface
        this.drawAPI.draw();
    }
}
