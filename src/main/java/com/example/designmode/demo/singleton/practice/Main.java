package com.example.designmode.demo.singleton.practice;

/**
 * @author george.zhang
 * @date 2020/9/29 13:35
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(TicketMarker.getInstance().getTicketAndIncrease());
        System.out.println(TicketMarker.getInstance().getTicketAndIncrease());
        System.out.println(TicketMarker.getInstance().getTicketAndIncrease());
        System.out.println(TicketMarker.getInstance().getTicketAndIncrease());

        System.out.println(Triple.getInstance(0).getId());
        System.out.println(Triple.getInstance(1).getId());
        System.out.println(Triple.getInstance(2).getId());
    }
}
