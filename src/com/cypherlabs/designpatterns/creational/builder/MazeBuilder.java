package com.manish.design.patterns.creational.builder;

import com.manish.design.patterns.creational.Maze;
import com.manish.design.patterns.creational.Room;

// Builder interface to create maze
public interface MazeBuilder {

    void buildMaze();

    void buildRoom(int roomNo);

    void buildDoor(int roomFrom, int roomTo);

    Maze getMaze();
}
