package com.cypherlabs.designpatterns.creational.abstractfactory;


import com.cypherlabs.designpatterns.creational.Door;
import com.cypherlabs.designpatterns.creational.DoorNeedingSpell;
import com.cypherlabs.designpatterns.creational.EnchantedRoom;
import com.cypherlabs.designpatterns.creational.Room;

// concrete implementation of abstract factory interface.It creates normal maze, enchanted room,basic wall,door with a spell
public class EnchantedMazeFactory extends BasicMazeFactory {

    public Room makeRoom(int roomNo)
    {
        return new EnchantedRoom(roomNo);
    }

    public Door makeDoor(Room r1, Room r2)
    {
        return new DoorNeedingSpell(r1, r2);
    }
}
