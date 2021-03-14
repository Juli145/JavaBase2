package com.company.OOP_HW;

import java.util.Locale;

public class ProcessorArm extends Processor{

    final String ARCHITECTURE = "ARM";

    @Override
    public String dataProcess(String data) {
        return data.toUpperCase(Locale.ROOT);
    }

    @Override
    public String dataProcess(long data) {
        return String.valueOf(Math.abs(data));
    }
}
