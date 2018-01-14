package com.cypherlabs.designpatterns.structural.decorator;

public class DecoratorB extends Decorator {

    public DecoratorB(Component component){
        super(component);
    }

    @Override
    public void coreFunctionality() {
        super.coreFunctionality();
        decorate();
    }

    private void decorate(){
        System.out.println("Decoration done by DecoratorB");
    }
}
