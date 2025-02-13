package edu.bothell.wampus;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private UI ui;
    private List<Teammate> teammates;
    private Teammate activeTeammate;

    public Controller(UI ui) {
        this.ui = ui;
        this.teammates = new ArrayList<>();
    }

    public void addPerson(Teammate teammate) {
        teammates.add(teammate);
    }

    public void start() {
        boolean continueGame = true;
        while (continueGame) {
            for (Teammate teammate : teammates) {
                ui.showPersonTurn((Person) teammate);
                Result result = teammate.doAction(ui);
                ui.showMessage(result.getMessage());
    
                continueGame = ui.askToContinue(teammate.getName());
                if (!continueGame) {
                    break;
                }
            }
        }
        ui.displaySummary();
    }

    public void updateActivePlayer(){
        int index = this.teammates.indexOf(activeTeammate);
        index++;
        if(index >= this.teammates.size()-1){
            index = 0;
        }
        this.activeTeammate = this.teammates.get(index);
    }
    
}
