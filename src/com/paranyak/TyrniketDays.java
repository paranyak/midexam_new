package com.paranyak;

/**
 * Created by cs.ucu.edu.ua on 12/29/2016.
 */
public class TyrniketDays extends AbstractTyrniket {
    Reestration r;
    public TyrniketDays(Tyrniket t, Reestration r) {
        super(t);
        this.r = r;
    }
    public TyrniketDays(Reestration r){this.r = r;}

    @Override
    public TicketSki go(int number){
        TicketSki curr = null;
        if (number > 0 && number <= r.insertIndex) {
            curr = r.tickets[number -1];
            if(curr.type != Type.SEASON){
                if(curr.days == 0){
                    System.out.println("This user do not have enough days. Please block him! Enter now this id " + number);
                    r.blockUser();
                }else{
                    curr.days -=1;
                    System.out.println("This ticket changed: ID: " + number + "-->" );
                }
            }else{
                System.out.println("You are our favorite client!");
            }

        }
        return curr;
    }
}
