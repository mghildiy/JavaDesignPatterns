package com.cypherlabs.designpatterns.creational.abstractfactory;


import com.cypherlabs.designpatterns.creational.Door;
import com.cypherlabs.designpatterns.creational.Maze;
import com.cypherlabs.designpatterns.creational.Room;
import com.cypherlabs.designpatterns.creational.Wall;

// Abstract Factory interface for creating related objects needed by maze
public interface MazeFactory {

    Maze makeMaze();

    Room makeRoom(int roomNo);

    Wall makeWall();

    Door makeDoor(Room r1, Room r2);
}
