package edu.bothell.wampus;

import java.util.HashMap;
import java.util.List;

public class LocationManager {
    // Properties
    private HashMap<Person, GameLocation> playerLocations;
    private Cave cave;

    // Constructors
    public LocationManager(List<Person> players, Cave cave){
        this.cave = cave;

        for(Person p: players){
            playerLocations.put(p, this.cave.spawnPoint());
        }
    }

    // Methods
}
