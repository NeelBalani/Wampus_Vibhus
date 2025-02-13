package edu.bothell.wampus;

import java.util.List;

public class Controller {

    // Properties
    private List<Result> actionHistory;
    private List<Person> players;
    private Person activePlayer;

    // Constructors
    public Controller(UI ui){

    }

    // Methods
    public void updateActivePlayer(){
        int index = this.players.indexOf(activePlayer);
        index++;
        if(index >= this.players.size()-1){
            index = 0;
        }
        this.activePlayer = this.players.get(index);
    }

}
