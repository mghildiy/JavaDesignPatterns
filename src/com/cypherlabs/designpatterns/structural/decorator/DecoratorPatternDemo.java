package com.cypherlabs.designpatterns.structural.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws Exception{
        // decorate the core component with DecoratorA,DecoratorB
        Component comp = new DecoratorA(new DecoratorB(new SimpleComponent()));
        comp.coreFunctionality();

        // another example
        BufferedInputStream bufferedInputSteam = new BufferedInputStream(new FileInputStream(new File("myfile.txt")));
        while(bufferedInputSteam.available()>0)
        {
            char c = (char)bufferedInputSteam.read();
        }
    }
}
