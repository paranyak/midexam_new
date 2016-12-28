package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 12/28/2016.
 */
public enum TripsType {
    WITHCOUNTING, WITHOUT, NOTYPETRIP;
    public String printType() {
        String a = "";
        switch (this) {
            case WITHCOUNTING:
                a = "Without counting";
                break;
            case WITHOUT: a = "With counting"; break;
        }
        return a;
    }
}
