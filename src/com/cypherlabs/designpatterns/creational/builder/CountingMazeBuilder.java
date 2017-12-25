package com.cypherlabs.designpatterns.creational.builder;


// implementation of builder pattern.It merely keeps count of doors and rooms.
public class CountingMazeBuilder extends BasicMazeBuilder {

    private int doors;
    private int rooms;

    @Override
    public void buildRoom(int roomNo) {
        ++this.rooms;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        ++this.doors;
    }

    public int getRoomCount(){
        return this.rooms;
    }

    public int getDoorCount(){
        return this.doors;
    }
}
