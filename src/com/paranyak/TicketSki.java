package com.paranyak;

import java.util.Scanner;

/**
 * Created by cs.ucu.edu.ua on 12/28/2016.
 */
public class TicketSki {
    protected Type type = Type.NOTYPE;
    protected TripsType trips = TripsType.NOTYPETRIP;
    protected int times = 0;
    protected int days = 0;
    public TicketSki(Type type, TripsType trips){
        this.type = type;
        this.trips = trips;
    }
    public TicketSki(){}
    public void setType(Type type){this.type = type;}
    public void setTripsType(TripsType trips){this.trips = trips;}
    public void setDays (int days){this.days = days;}
    public void setTimes(int times){this.times = times;}

    public Type getType(){return this.type;}
    public TripsType getTrips(){return this.trips;}
    public int getTimes(){return this.times;}
    public int getDays(){return this.days;}


    public String creationProcess(){
        String process = "";
        if(this.type != Type.NOTYPE && this.trips != TripsType.NOTYPETRIP){
            if(this.trips == TripsType.WITHCOUNTING && this.type != Type.SEASON){
                System.out.println("Please choose amount of times: 10/20/50/100");
                Scanner sc = new Scanner(System.in);
                this.times = sc.nextInt();
                process = "Type of ticket:" + this.type + ", trips:" + this.trips + ", times:" + this.times;
            }else if(this.trips == TripsType.WITHOUT && this.type == Type.WEEKDAY){
                System.out.println("Please choose amount of days: 1/2/5");
                Scanner sc = new Scanner(System.in);
                this.days = sc.nextInt();
                process = "Type of ticket:" + this.type + ", trips:" + this.trips + ", days:" + this.days;
            }else if(this.trips == TripsType.WITHOUT && this.type == Type.WEEKEND){
                System.out.println("Please choose amount of days: 1 or 2");
                Scanner sc = new Scanner(System.in);
                this.days = sc.nextInt();
                process = "Type of ticket:" + this.type + ", trips:" + this.trips + ", days:" + this.days;
            }else if (this.type == Type.SEASON){
                this.days = 1000;
                this.times = 1000;
                process = "You have Premium ticket :)";
            }
        }
        return process;
    }


    public String toString() {
        return "Type: " + this.type.printType() + ", Trips: " + this.trips.printType() + ", days/times : " + this.days + "/" + this.times + "**";
    }


}
