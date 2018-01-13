package com.cypherlabs.designpatterns.structural.composite;

public class CompositePatternDemo {

    public static void main(String[] args){
        CompositeA compositeA = new CompositeA();
        compositeA.add(new LeafA());
        CompositeB compositeB = new CompositeB();
        compositeB.add(new LeafA());
        compositeB.add(new LeafB());
        compositeA.add(compositeB);
        compositeA.draw();
    }
}
