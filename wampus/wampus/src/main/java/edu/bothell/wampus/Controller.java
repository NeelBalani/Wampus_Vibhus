package edu.bothell.wampus;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private UI ui;
    private List<Teammate> activeTeammates;
    private List<Teammate> allTeammates;
    private Teammate activeTeammate;
    private Result[] summary;

    public Controller(UI ui) {
        this.ui = ui;
        this.activeTeammates = new ArrayList<>();
        this.allTeammates = this.activeTeammates;
    }

    public void addPerson(Teammate teammate) {
        activeTeammates.add(teammate);
    }

    public void start() {
        boolean continueGame;
        while (!gameOver()) {
            ui.showPersonTurn((Person) activeTeammate);
            Result result = activeTeammate.doAction(ui);
            ui.showMessage(result.getMessage());
            continueGame = ui.askToContinue(activeTeammate.getName());
            if(!continueGame){
                removePlayer(activeTeammate);
            }
        }
        ui.displaySummary();
    }

    public boolean gameOver(){
        return this.activeTeammates.isEmpty();
    }

    public void removePlayer(Teammate teammate){
        this.activeTeammates.remove(teammate);
    }

    public void updateActivePlayer(){
        int index = this.activeTeammates.indexOf(activeTeammate);
        index++;
        if(index >= this.activeTeammates.size()-1){
            index = 0;
        }
        this.activeTeammate = this.activeTeammates.get(index);
    }
    
    public void returnSummary(){
        for(Result results : this.summary){
            ui.showMessage(results.getMessage());
        }
    }
}
