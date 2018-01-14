package com.cypherlabs.designpatterns.structural.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args){
        // decorate the core component with DecoratorA,DecoratorB
        Component comp = new DecoratorA(new DecoratorB(new SimpleComponent()));
        comp.coreFunctionality();
    }
}
