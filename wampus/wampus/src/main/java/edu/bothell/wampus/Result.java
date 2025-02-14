package edu.bothell.wampus;

public class Result {
    // Properties
    private String message;
    private GameLocation location;
    private Person player;

    // Constructor
    public Result(String message, Person player) {
        this.message = message;
        this.player = player;
    }

    // Methods

    public void addLocationToMessage() {
        if(this.message.equals("Performed Shoot") || this.message.equals("Performed Move")){
            this.message += " in " + this.location.getLocation();
        }
    }

    public String getMessage() {
        return this.player + ":" + this.message;
    }

    public void addGameLocation(GameLocation location){
        this.location = location;
    }
}
