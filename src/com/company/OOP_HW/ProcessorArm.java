package com.company.OOP_HW;

public class ProcessorArm extends Processor{

    final String ARCHITECTURE = "ARM";

    @Override
    public String dataProcess(String data) {
        data.toUpperCase();
        return data;
    }

    @Override
    public String dataProcess(long data) {
        return String.valueOf(Math.abs(data));
    }
}
