package com.example.designmode.demo.singleton.practice;

/**
 * @author george.zhang
 * @date 2020/9/29 13:32
 * @Description
 */
public class TicketMarker {
    private Integer ticket=1000;

    /*private volatile static TicketMarker ticketMarker=null;
    private TicketMarker(){}

    public static TicketMarker getInstance(){
        if(ticketMarker==null){
            synchronized (TicketMarker.class){
                if(ticketMarker==null){
                    ticketMarker = new TicketMarker();
                }
            }
        }
        return ticketMarker;
    }*/

    private static class SingtelenInner{
        private static TicketMarker ticketMarker = new TicketMarker();
    }

    public static TicketMarker getInstance(){
        return SingtelenInner.ticketMarker;
    }


    public Integer getTicketAndIncrease(){
        return ticket++;
    }


}
