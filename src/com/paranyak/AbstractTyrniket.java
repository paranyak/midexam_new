package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 12/29/2016.
 */
public class AbstractTyrniket implements Tyrniket{

    protected Tyrniket t;
    public AbstractTyrniket(Tyrniket t){this.t = t;}
    public  AbstractTyrniket(){}
    @Override
    public TicketSki go(int number) {
        return null;
    }
}
