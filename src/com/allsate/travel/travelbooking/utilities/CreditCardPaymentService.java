package com.allsate.travel.travelbooking.utilities;

import com.allsate.travel.travelbooking.domain.TravelTicket;

import java.math.BigDecimal;

public class CreditCardPaymentService implements PaymentService {

    @Override
    public void requestPayment() {

    }

    @Override
    public void addTicket(TravelTicket t) {
    }

    @Override
    public BigDecimal getTotalIncludingTaxesAndFees() {
        return BigDecimal.ZERO;
    }
}
