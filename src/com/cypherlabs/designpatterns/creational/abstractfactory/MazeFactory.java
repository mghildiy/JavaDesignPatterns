package com.manish.design.patterns.creational.abstractfactory;

import com.manish.design.patterns.creational.Door;
import com.manish.design.patterns.creational.Maze;
import com.manish.design.patterns.creational.Room;
import com.manish.design.patterns.creational.Wall;

// Abstract Factory interface for creating related objects needed by maze
public interface MazeFactory {

    Maze makeMaze();

    Room makeRoom(int roomNo);

    Wall makeWall();

    Door makeDoor(Room r1, Room r2);
}
