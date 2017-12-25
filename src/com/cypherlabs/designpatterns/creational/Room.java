package com.cypherlabs.designpatterns.creational;

import java.util.HashMap;
import java.util.Map;

public class Room extends MapSite {

    private int roomNo;
    //private MapSite[] sides = new MapSite[4];
    private Map<Direction,MapSite> sides = new HashMap();

    public Room(int roomNo){
        this.roomNo = roomNo;
    }

    @Override
    public void enter() {

    }

    public MapSite getSide(Direction direction){
        return sides.get(direction);
    }

    public void setSide(Direction direction,MapSite mapSite){
        sides.put(direction,mapSite);
    }

    public int getRoomNo(){
        return this.roomNo;
    }
}
