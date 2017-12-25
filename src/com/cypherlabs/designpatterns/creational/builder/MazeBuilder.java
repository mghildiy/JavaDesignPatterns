package com.cypherlabs.designpatterns.creational.builder;


import com.cypherlabs.designpatterns.creational.Maze;

// Builder interface to create maze
public interface MazeBuilder {

    void buildMaze();

    void buildRoom(int roomNo);

    void buildDoor(int roomFrom, int roomTo);

    Maze getMaze();
}
