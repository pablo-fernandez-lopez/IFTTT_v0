package es.ulpgc.iftt.model;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private int ID;
    private String name;
    private String description;

    List<Condition> conditions;
    List<Action> actions;

    public Rule(int ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.conditions = new ArrayList<Condition>();
        this.actions = new ArrayList<Action>();
    }

    public void addCondition(Condition condition){
        this.conditions.add(condition);
    }

    public void addAction(Action action){
        this.actions.add(action);
    }

    public void execute(){
        if (this.isTrueAllConditions())
            this.actAllActions();
    }

    private boolean isTrueAllConditions(){
        boolean result = true;
        for (Condition condition : conditions)
            if (!condition.evaluate()) {
                result = false;
                break;
            }
        return result;
    }

    private void actAllActions(){
        for (Action action : actions)
            action.actuate();
    }

}
