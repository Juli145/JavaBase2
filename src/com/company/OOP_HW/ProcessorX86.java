package com.company.OOP_HW;

public class ProcessorX86 extends Processor{

    final String ARCHITECTURE = "X86";

    @Override
    public String dataProcess(String data) {
        data.toLowerCase();
        return data;
    }

    @Override
    public String dataProcess(long data) {
        return String.valueOf(Math.incrementExact(data));
    }
}
