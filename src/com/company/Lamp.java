package com.company;

import java.util.Scanner;

public class Lamp {

    private boolean lampState;
    private String name;

    public Lamp(String name) {
        this.lampState = false;
        this.name = name;
    }

    public Lamp(boolean parameterState) {
        this.lampState = parameterState;

    }

    public boolean getLampState() {
        return lampState;
    }

    public void setLampState(boolean lampState) {
        this.lampState = lampState;
    }

    public String toString() {
        if (lampState == true) {
            return name + " er tændt";
        } else {
            return name + " er slukket";
        }
    }

    public void lampSwitch() {

        if (lampState == true) {
            lampState = false;
        } else {
            lampState = true;
        }

    }
}

