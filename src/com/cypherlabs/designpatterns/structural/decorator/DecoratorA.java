package com.cypherlabs.designpatterns.structural.decorator;

public class DecoratorA extends Decorator {

    public DecoratorA(Component component){
        super(component);
    }

    @Override
    public void coreFunctionality() {
        super.coreFunctionality();
        decorate();
    }

    private void decorate(){
        System.out.println("Decoration done by DecoratorA");
    }
}
