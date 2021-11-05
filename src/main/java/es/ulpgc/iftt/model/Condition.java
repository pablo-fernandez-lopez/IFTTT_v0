package es.ulpgc.iftt.model;

public class Condition {
    private Object threshold;
    private RelationalOperator relationaloperator;
    private Sensor sensor;

    public Condition(Object threshold, RelationalOperator relationaloperator, Sensor sensor) {
        this.threshold = threshold;
        this.relationaloperator = relationaloperator;
        this.sensor = sensor;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public boolean evaluate(){

        return this.relationaloperator.evaluate(this.threshold,
                this.sensor.getValue());
    }
}
