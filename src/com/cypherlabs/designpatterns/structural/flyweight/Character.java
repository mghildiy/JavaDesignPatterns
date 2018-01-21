package com.cypherlabs.designpatterns.structural.flyweight;

import java.awt.*;

public class Character implements GraphicalElement {

    // intrinsic information: this is the shared information, so we keep it immutable
    private static char c;

    public Character(char c){
        this.c = c;
    }

    //point is extrinsic information, and supplied from different contexts
    public void draw(Point pos){
        // draw the character
        System.out.println("Draw the flyweight character at "+pos.x+","+pos.y);
    }
}
