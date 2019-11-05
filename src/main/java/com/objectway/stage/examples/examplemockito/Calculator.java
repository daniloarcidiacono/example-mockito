package com.objectway.stage.examples.examplemockito;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator {
    private ALU alu;
    private RAM ram;

    public Calculator() {
    }

    public Calculator(ALU alu, RAM ram) {
        this.alu = alu;
        this.ram = ram;
    }

    public int getLastResult() {
        return ram.getValue();
    }

    public int sum(final int a, final int b) {
        final int result = alu.sum(a, b);
        ram.store(result);
        return result;
    }

    public ALU getAlu() {
        return alu;
    }

    @Autowired
    public void setAlu(ALU alu) {
        this.alu = alu;
    }

    public RAM getRam() {
        return ram;
    }

    @Autowired
    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
