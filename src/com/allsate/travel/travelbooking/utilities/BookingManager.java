package com.allsate.travel.travelbooking.utilities;

import com.allsate.travel.travelbooking.domain.TravelTicket;

import java.util.ArrayList;

public class BookingManager {
    ArrayList<TravelTicket> tickets;
    PaymentService paymentService;

    public BookingManager(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void start() {
        tickets = new ArrayList<>();
    }

    public void addTicket(TravelTicket t) {
        tickets.add(t);
        paymentService.addTicket(t);
        System.out.println();
    }
}
