package com.paranyak;

import java.util.Scanner;

/**
 * Created by cs.ucu.edu.ua on 12/28/2016.
 */
public class Reestration {
    int defaultSize = 10;
    protected int insertIndex = 0;
    TicketSki tickets [] = new TicketSki[defaultSize];

    public void addTicket(TicketSki nw) {
        checkSize();
        tickets[insertIndex] = nw;
        insertIndex++;
    }
    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            TicketSki[] b = new TicketSki[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = tickets[i];
            }
            tickets= b;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i++) {
            s +="ID: " + String.valueOf(i+1) + " " + tickets[i].toString() + "\n";
        }
        return s;
    }

    public String blockUser() {
        System.out.println("If you want to block user, just enter his id: ");
        Scanner sc = new Scanner(System.in);
        int ind = sc.nextInt();
        if (ind > 0 && ind <= insertIndex) {
            TicketSki[] b = new TicketSki[defaultSize];
            for (int i = 0; i < ind - 1; i++) {
                b[i] = tickets[i];
            }
            for (int i = ind; i < insertIndex; i++) {
                b[i - 1] = tickets[i];
            }
            tickets = b;
            insertIndex -= 1;
        }
        return tickets.toString();
    }}
