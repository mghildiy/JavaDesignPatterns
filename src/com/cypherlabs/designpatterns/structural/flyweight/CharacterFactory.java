package com.cypherlabs.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// factory class for characters
public class CharacterFactory {

    // map to store flyweight objects.This way only one instance is created for a given character
    private static final Map<java.lang.Character,GraphicalElement> hm = new HashMap();

    // get flyweight object for given character
    public static GraphicalElement getCharacter(char c) {
        GraphicalElement ge = null;
        if (hm.containsKey(c)) {
            ge = hm.get(c);
        }
        else{
            ge = new Character(c);
            hm.put(c,ge);
        }
        return ge;
    }
}
