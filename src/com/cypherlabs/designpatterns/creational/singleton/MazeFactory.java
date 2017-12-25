package com.manish.design.patterns.creational.singleton;

// singleton pattern to ensure single isntance of MazeFactory
public class MazeFactory {

    private MazeFactory factory = new MazeFactory();

    private MazeFactory(){
        // TODO
    }

    public MazeFactory getInstance(){
        return this.factory;
    }
}
