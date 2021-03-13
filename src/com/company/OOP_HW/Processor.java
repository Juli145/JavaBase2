package com.company.OOP_HW;

public abstract class Processor {
    int frequency;
    int cache;
    int bitCapacity;

    public String getDetails(){
        return "frequency: " + frequency + "cache" + cache + "bitCapacity" + bitCapacity;
    }
    public abstract String dataProcess(String data);
    public abstract String dataProcess(long data);
}
