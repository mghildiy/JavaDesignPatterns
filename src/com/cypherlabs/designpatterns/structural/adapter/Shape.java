package com.cypherlabs.designpatterns.structural.adapter;


import java.awt.*;

// This is target class for client.
public interface Shape {

    void BoundingBox(Point bottomLeft, Point topRight);
}
