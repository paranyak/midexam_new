package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 12/28/2016.
 */
public class Main {
    public static void main(String[] args) {
        Reestration rstr = new Reestration();
        TicketSki tick = new TicketSki();
        tick.setType(Type.WEEKDAY);
        tick.setTripsType(TripsType.WITHCOUNTING);
        tick.creationProcess();
        System.out.println(tick);
        rstr.addTicket(tick);

        TicketSki tick2 = new TicketSki();
        tick2.setType(Type.SEASON);
        tick2.creationProcess();
        System.out.println(tick2);
        rstr.addTicket(tick2);

        TicketSki tick3 = new TicketSki();
        tick3.setType(Type.WEEKEND);
        tick3.setTripsType(TripsType.WITHOUT);
        tick3.creationProcess();
        System.out.println(tick3);
        rstr.addTicket(tick3);
        System.out.println("Reestration base: " + rstr);

        rstr.blockUser();
        System.out.println("Reestration base: " + rstr);
    }
}
