package com.cypherlabs.designpatterns.creational.factorymethod;

import com.cypherlabs.designpatterns.creational.*;

public class BombedMazeGame extends MazeGame {

    public Wall makeWall(){
        return new BombedWall();
    }

    public Room makeRoom(int roomNo){
        return new RoomWithABomb(roomNo);
    }
}
