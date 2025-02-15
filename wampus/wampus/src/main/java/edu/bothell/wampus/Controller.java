package edu.bothell.wampus;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private UI ui;
    private List<Person> activeTeammates = new ArrayList<>();
    private List<Person> allTeammates = new ArrayList<>();
    private Person activeTeammate;
    private List<Result> summary = new ArrayList<>();
    private boolean continueGame;

    public Controller() {
        this.activeTeammates = new ArrayList<>();
        this.allTeammates = this.activeTeammates;
    }

    public void setUI(UI ui){
        this.ui = ui;
    }

    public void addPerson(Person teammate) {
        activeTeammates.add(teammate);
    }

    public void start() {
        this.activeTeammate = this.activeTeammates.get(0);
        while (!gameOver()) {

            this.ui.showPersonTurn((this.activeTeammate));
            Result result = this.activeTeammate.doAction(this.ui);
            // Check if the player moved
            if(result.getAction().equals("Move")){
                Directions direction = activeTeammate.doMove(this.ui);
                result.addDirectionToMessage(direction);
            }

            addResult(result);
            this.ui.showMessage(result.getMessage());

            this.continueGame = this.ui.askToContinue(this.activeTeammate.getName());
            if(!this.continueGame){
                removePlayer(this.activeTeammate);
            }
            if(!gameOver()) updateActivePlayer();
        }
        this.ui.displaySummary();
    }

    public void addResult(Result result){
        this.summary.add(result);
    }

    public boolean gameOver(){
        return this.activeTeammates.isEmpty();
    }

    public void removePlayer(Person teammate){
        this.activeTeammates.remove(teammate);
    }

    public void updateActivePlayer(){
        int index = this.activeTeammates.indexOf(this.activeTeammate);
        index++;
        if(index >= this.activeTeammates.size()-1){
            index = 0;
        }
        this.activeTeammate = this.activeTeammates.get(index);
    }
    
    public List<Result> getSummary(){
        return this.summary;
    }
}
