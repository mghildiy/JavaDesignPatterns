package com.manish.design.patterns.creational.builder;

import com.manish.design.patterns.creational.*;

// basic implementation of builder pattern interface
public class BasicMazeBuilder implements MazeBuilder {

    private Maze currentMaze;

    @Override
    public void buildMaze() {
        this.currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNo) {
        if(this.currentMaze.getRoom(roomNo) == null){
            Room room = new Room(roomNo);
            room.setSide(Direction.East,new Wall());
            room.setSide(Direction.West,new Wall());
            room.setSide(Direction.North,new Wall());
            room.setSide(Direction.South,new Wall());

            this.currentMaze.addRoom(room);
        }
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room r1 = this.currentMaze.getRoom(roomFrom);
        Room r2 = this.currentMaze.getRoom(roomTo);

        Door d = new Door(r2,r2);
        r1.setSide(this.commonWall(r1,r2),d);
        r2.setSide(this.commonWall(r2,r1),d);
    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }

    // utility operation to find direction of common w all between two rooms
    Direction commonWall(Room r1,Room r2){
        return null;
    }
}
