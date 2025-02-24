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

        setNewPlayers(players);
    }
    public LocationManager(Cave cave){
        this.cave = cave;
    }

    // Methods

    public void setNewPlayers (List<Person> players){
        for(Person p: players){
            playerLocations.put(p, this.cave.spawnPoint());
        }
    }

    public GameLocation getGameLocation(Person p){
        return this.playerLocations.get(p);
    }
}
