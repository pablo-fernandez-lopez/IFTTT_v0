package es.ulpgc.iftt.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int ID;
    private String user_name;
    private String user_password;
    private Mail user_mail;

    List<Rule> rules;
    List<Sensor> sensors;
    List<Actuator> actuators;

    public Account(int ID, String user_name, String user_password, Mail user_mail) {
        this.ID = ID;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_mail = user_mail;
        this.rules = new ArrayList<Rule>();
        this.sensors = new ArrayList<Sensor>();
        this.actuators = new ArrayList<Actuator>();
    }


}
