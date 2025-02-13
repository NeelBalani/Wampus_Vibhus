package edu.bothell.wampus;

import java.util.ArrayList;
import java.util.List;

public class Pranav implements Teammate, Person {
    private String name;
    private List<String> actions;

    public Pranav(String name) {
        this.name = name;
        this.actions = new ArrayList<>();
        actions.add("Action 1");
        actions.add("Action 2");
        actions.add("Action 3");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getActions() {
        return actions;
    }

    @Override
    public Result doAction(UI ui) {
        int actionIndex = ui.getActionChoice(actions);
        String action = actions.get(actionIndex);
        return new Result("Performed " + action);
    }
}
