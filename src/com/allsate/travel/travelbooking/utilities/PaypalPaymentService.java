package com.allsate.travel.travelbooking.utilities;

import com.allsate.travel.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public class PaypalPaymentService implements PaymentService {

    TravelTicket ticket;

    @Override
    public void requestPayment() {
        System.out.println();
    }

    @Override
    public void addTicket(TravelTicket t) {
        this.ticket = t;

    }

    @Override
    public BigDecimal getTotalIncludingTaxesAndFees() {
        return ticket.getPrice().multiply(new BigDecimal("1.2"));
    }

    public void setT(){

    }
}
