package com.cypherlabs.designpatterns.creational;

import com.cypherlabs.designpatterns.creational.abstractfactory.MazeFactory;
import com.cypherlabs.designpatterns.creational.builder.MazeBuilder;

public class MazeGame {

    // factory can be any of the concrete implementations of abstract factory interface
    // factory just takes care of creating appropriate polymorphic objects, arrangement of those objects is responsibility of client
    public Maze createMaze(MazeFactory factory){
        Maze aMaze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door aDoor = factory.makeDoor(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.North, factory.makeWall());
        r1.setSide(Direction.East, aDoor);
        r1.setSide(Direction.South, factory.makeWall());
        r1.setSide(Direction.West, factory.makeWall());
        r2.setSide(Direction.North, factory.makeWall());
        r2.setSide(Direction.East, factory.makeWall());
        r2.setSide(Direction.South, factory.makeWall());
        r2.setSide(Direction.West, aDoor);
        return aMaze;
    }

    // builder can be any of the concrete implementation of builder interface
    // builder encapsulates entire arrangement of the objects
    public Maze createMaze(MazeBuilder builder){
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }

    // basic methods for factory method pattern. Subclasses to overide these factory methods to create objects as per their needs
    public Maze makeMaze(){
        return new Maze();
    }

    public Room makeRoom(int roomNo){
        return new Room(roomNo);
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Door makeDoor(Room r1,Room r2){
        return new Door(r1,r2);
    }

    public Maze createMaze(){
        Maze aMaze = this.makeMaze();
        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.North, makeWall());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, makeWall());
        r1.setSide(Direction.West, makeWall());
        r2.setSide(Direction.North, makeWall());
        r2.setSide(Direction.East, makeWall());
        r2.setSide(Direction.South, makeWall());
        r2.setSide(Direction.West, theDoor);

        return aMaze;
    }
}
