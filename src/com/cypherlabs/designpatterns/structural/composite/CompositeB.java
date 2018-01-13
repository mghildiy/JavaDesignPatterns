package com.cypherlabs.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

// composite
public class CompositeB implements Draw{

    List<Draw> objsToDraw = new ArrayList();

    public void draw(){
        for(Draw draw:this.objsToDraw){
            draw.draw();
        }
    }

    public void add(Draw draw){
        this.objsToDraw.add(draw);
    }

    public void remove(Draw draw){
        this.objsToDraw.remove(draw);
    }

}
