package com.manish.design.patterns.creational;

public class Door extends MapSite {

    private boolean isOpen;
    private Room room1;
    private Room room2;

    public Door(Room room1,Room room2){
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room otherSideFrom(Room room){
        if(room == room1){
            return room2;
        }else{
            return room1;
        }
    }


    @Override
    public void enter() {

    }
}