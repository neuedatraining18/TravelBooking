package com.allsate.travel.travelbooking.utilities;

import com.allsate.travel.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public interface PaymentService {

    public void requestPayment();
    public void addTicket(TravelTicket t);
    public BigDecimal getTotalIncludingTaxesAndFees();
    default public void processRefund() {
        System.out.println("This feature has not yet been implemented");
    }

    static PaymentService getInstance(){
        return new PaypalPaymentService();
    }
}

