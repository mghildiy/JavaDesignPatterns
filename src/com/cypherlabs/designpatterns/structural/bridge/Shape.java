package com.cypherlabs.designpatterns.structural.bridge;

public abstract class Shape {

    // reference to bridge interface. So now actual implementation of 'draw' is no more in this inheritance hierarchy,
    //but it is rather delegated to the inheritance hierarchy containing bridge interface(DrawAPI)
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
