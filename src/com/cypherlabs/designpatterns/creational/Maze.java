package com.manish.design.patterns.creational;

import java.util.List;

public class Maze {

    private List<Room> rooms;

    public void addRoom(Room room){
        rooms.add(room);
    }

    public Room getRoom(int roomNo){
        for(Room room:this.rooms){
            if(room.getRoomNo() == roomNo){
                return room;
            }
        }

        return null;
    }
}
