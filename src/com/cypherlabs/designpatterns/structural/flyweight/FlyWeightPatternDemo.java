package com.cypherlabs.designpatterns.structural.flyweight;

import java.awt.*;

public class FlyWeightPatternDemo {

    public static void main(String[] args){
        GraphicalElement ge1 = CharacterFactory.getCharacter('a');
        ge1.draw(new Point(10,10));
        GraphicalElement ge2 = CharacterFactory.getCharacter('a');
        ge2.draw(new Point(20,20));
        if(ge1 != ge2)
            throw new RuntimeException("Different objects");
        else{
            System.out.println("Same objects");
        }
    }
}
