package com.company.OOP_HW;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public static List<Device> filtrateByArchitecture(Device[] devices, String arch) {
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getProcessor().getArchitecture().equals(arch)) {
                res.add(devices[i]);
            }
        }
        return res;
    }

    public static List<Device> filtrateByCash(Device[] devices, double cash) { // 3 or 8
        List<Device> res = new ArrayList<>();
        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getProcessor().getCache() == cash) {
                res.add(devices[i]);
            }
        }
        return res;
    }
}
