package edu.bothell.wampus;

import java.util.Arrays;

public class Result {
    // Properties
    private String message;
    private String action;
    private GameLocation location;
    private Person player;

    // Constructor
    public Result(String action, Person player) {
        this.action = action;
        this.player = player;
        this.message = "Preformed " + action;
    }

    // Methods

    public void addDirectionToMessage(Directions direction) {
        if(this.message.equals("Shoot")){
            this.message += " to the " + (direction.name());
        }
    }

    public void addFinalGameLocation(GameLocation location) {
        if(this.message.equals("Move"))
    }

    public String getAction() {
        return this.action;
    }

    public String getMessage() {
        return this.player.getName() + ":" + this.message;
    }

    public void addGameLocation(GameLocation location){
        this.location = location;
    }
}
