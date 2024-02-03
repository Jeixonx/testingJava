package com.platzi.javatests.payments;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaymentProcessor {

    private PaymentGateway paymentGateway;
    public boolean makePayment(double amount){
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest((amount)));
        return (response.getStatus() == PaymentResponse.PaymentStatus.OK);
    }
}
