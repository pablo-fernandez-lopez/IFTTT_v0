package es.ulpgc.iftt.model;

public class Action {
    private Object threshold;
    private Actuator actuator;

    public Action(Object threshold, Actuator actuator) {
        this.threshold = threshold;
        this.actuator = actuator;
    }

    public void actuate(){
        this.actuator.actuate(this.threshold);
    }

}
