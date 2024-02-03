package com.platzi.javatests.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentResponse {

    enum PaymentStatus{
        OK, ERROR
    }
    private PaymentStatus status;
}
