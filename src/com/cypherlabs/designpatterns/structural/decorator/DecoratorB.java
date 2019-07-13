package com.cypherlabs.designpatterns.structural.decorator;

public class DecoratorB extends Decorator {
    Component component;

    public DecoratorB(Component component){
        this.component = component;
    }

    @Override
    public void coreFunctionality() {
        this.component.coreFunctionality();
        decorate();
    }

    private void decorate(){
        System.out.println("Decoration done by DecoratorB");
    }
}
