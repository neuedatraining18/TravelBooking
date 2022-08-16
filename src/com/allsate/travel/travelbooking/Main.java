package com.allsate.travel.travelbooking;

import com.allsate.travel.travelbooking.domain.PlaneTicket;
import com.allsate.travel.travelbooking.domain.TrainTicket;
import com.allsate.travel.travelbooking.domain.TravelTicket;
import com.allsate.travel.travelbooking.utilities.BookingManager;
import com.allsate.travel.travelbooking.utilities.CreditCardPaymentService;
import com.allsate.travel.travelbooking.utilities.PaymentService;
import com.allsate.travel.travelbooking.utilities.PaypalPaymentService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TrainTicket t = new TrainTicket();
        PlaneTicket p = new PlaneTicket();

        p.setSeatNumber(17);
        p.setNumberOfLayovers(0);
        p.setDestination("LAX");

        PlaneTicket p2 = new PlaneTicket();
        p2.setSeatNumber(17);
        p2.setNumberOfLayovers(0);
        p2.setDestination("LAX");

        System.out.println(p == p2);
        System.out.println(p.equals(p2));

        PlaneTicket p3 = p2;
        System.out.println(p2 == p3);

        System.out.println(p.getClass());
        System.out.println(t.getClass());

        System.out.println(p.toString());
        System.out.println(p);
        p.reschedule();


        //try{
            //TrainTicket trainFromChicagoToBoston = new TrainTicket(123,"Chicago","Boston", new BigDecimal("12600"));
       // }
        //catch (InvalidTravelDuration e) {
        //System.out.println("You cannot arrive before you depart"); }
        List<TravelTicket> travelTickets = new ArrayList<>();
        travelTickets.add(p);
        travelTickets.add(p2);
        travelTickets.add(t);

        for(TravelTicket ticket: travelTickets) {
            System.out.println(ticket);
        if(ticket instanceof PlaneTicket) {
            System.out.println("this is a plane ticket");
            PlaneTicket pt = (PlaneTicket)ticket;
        }
        if(ticket instanceof TrainTicket) {
            System.out.println("this is a train ticket");
            TrainTicket tt = (TrainTicket) ticket;
            }
        }

        PaymentService paymentService = new PaypalPaymentService();
        PaymentService paymentService1 = new CreditCardPaymentService();
        BookingManager bookingManager = new BookingManager(paymentService1);
        bookingManager.start();
        bookingManager.addTicket(p);


    }
}
