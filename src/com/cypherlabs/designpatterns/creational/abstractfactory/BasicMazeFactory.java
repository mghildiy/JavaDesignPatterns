package com.manish.design.patterns.creational.abstractfactory;

import com.manish.design.patterns.creational.Door;
import com.manish.design.patterns.creational.Maze;
import com.manish.design.patterns.creational.Room;
import com.manish.design.patterns.creational.Wall;

// concrete implementation of abstract factory interface.It creates basic maze, basic room, basic wall, basic door
public class BasicMazeFactory implements MazeFactory {

    public Maze makeMaze(){
        return new Maze();
    }

    public Room makeRoom(int roomNo){
        return new Room(roomNo);
    }

    public Wall makeWall(){
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1,r2);
    }
}
