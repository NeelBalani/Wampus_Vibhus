package edu.bothell.wampus;

import java.util.ArrayList;
import java.util.List;

public class Pranav implements Teammate, Person {
    private String name;
    private List<String> actions;

    public Pranav(String name) {
        this.name = name;
        this.actions = new ArrayList<>();
        actions.add("Shoot");
        actions.add("Move");
        actions.add("Heal");
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
