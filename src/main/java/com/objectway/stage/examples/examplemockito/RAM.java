package com.objectway.stage.examples.examplemockito;

public class RAM {
    private int value = 0;

    public void reset() {
        value = 0;
    }

    public void store(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
