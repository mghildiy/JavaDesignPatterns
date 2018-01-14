package com.cypherlabs.designpatterns.structural.facade;

public class Facade {

    private PartA a;
    private PartB b;
    private PartC c;

    public Facade(){
        a = new PartA();
        b = new PartB();
        c = new PartC();
    }

    // to be called by clients
    public void doIt(){
        a.magicByPartA();
        b.magicByPartB();
        c.magicByPartC();
    }
}
