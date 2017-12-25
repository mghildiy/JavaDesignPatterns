package com.cypherlabs.designpatterns.creational.abstractfactory;


import com.cypherlabs.designpatterns.creational.BombedWall;
import com.cypherlabs.designpatterns.creational.Room;
import com.cypherlabs.designpatterns.creational.RoomWithABomb;
import com.cypherlabs.designpatterns.creational.Wall;

// concrete implementation of abstract factory interface.It creates basic maze,room with a bomb,wall with a bomb, basic door
public class BombedMazeFactory extends BasicMazeFactory {

    public Wall makeWall() {
        return new BombedWall();
    }

    public Room makeRoom(int roomNo)  {
        return new RoomWithABomb(roomNo);
    }
}
