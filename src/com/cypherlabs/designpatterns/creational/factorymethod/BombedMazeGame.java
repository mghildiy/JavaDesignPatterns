package com.manish.design.patterns.creational.factorymethod;

import com.manish.design.patterns.creational.*;

public class BombedMazeGame extends MazeGame {

    public Wall makeWall(){
        return new BombedWall();
    }

    public Room makeRoom(int roomNo){
        return new RoomWithABomb(roomNo);
    }
}
