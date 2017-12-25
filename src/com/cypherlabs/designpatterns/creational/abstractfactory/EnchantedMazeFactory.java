package com.manish.design.patterns.creational.abstractfactory;

import com.manish.design.patterns.creational.Door;
import com.manish.design.patterns.creational.DoorNeedingSpell;
import com.manish.design.patterns.creational.EnchantedRoom;
import com.manish.design.patterns.creational.Room;

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
