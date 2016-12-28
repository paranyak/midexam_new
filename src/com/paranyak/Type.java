package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum Type {
    WEEKDAY, WEEKEND, SEASON, NOTYPE;

    public String printType() {
        String a = "";
        switch (this) {
            case WEEKDAY:
                a = "Weekdays";
                break;
            case WEEKEND: a = "Weekend"; break;
            case SEASON: a = "Season/PREMIUM"; break;
        }
        return a;
    }
}