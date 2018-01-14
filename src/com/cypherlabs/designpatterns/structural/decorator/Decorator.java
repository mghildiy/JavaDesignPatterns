package com.cypherlabs.designpatterns.structural.decorator;

public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void coreFunctionality(){
        //delegate to core component
        component.coreFunctionality();
    }
}
