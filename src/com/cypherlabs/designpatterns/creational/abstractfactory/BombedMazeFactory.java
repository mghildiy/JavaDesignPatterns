package com.manish.design.patterns.creational.abstractfactory;

import com.manish.design.patterns.creational.BombedWall;
import com.manish.design.patterns.creational.Room;
import com.manish.design.patterns.creational.RoomWithABomb;
import com.manish.design.patterns.creational.Wall;

// concrete implementation of abstract factory interface.It creates basic maze,room with a bomb,wall with a bomb, basic door
public class BombedMazeFactory extends BasicMazeFactory {

    public Wall makeWall() {
        return new BombedWall();
    }

    public Room makeRoom(int roomNo)  {
        return new RoomWithABomb(roomNo);
    }
}
