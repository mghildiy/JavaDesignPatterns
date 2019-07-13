package com.cypherlabs.designpatterns.structural.decorator;

public class DecoratorA extends Decorator {
    Component component;

    public DecoratorA(Component component){
        this.component = component;
    }

    @Override
    public void coreFunctionality() {
        this.component.coreFunctionality();
        decorate();
    }

    private void decorate(){
        System.out.println("Decoration done by DecoratorA");
    }
}
