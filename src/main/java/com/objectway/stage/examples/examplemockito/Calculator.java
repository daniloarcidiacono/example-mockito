package com.objectway.stage.examples.examplemockito;

public class Calculator {
    private ALU alu;
    private RAM ram;

    public Calculator() {
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

    public void setAlu(ALU alu) {
        this.alu = alu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
