package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);

    }

    @Test
    public void payment_is_correct() {

        //Arrange
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //Act
        Boolean result = paymentProcessor.makePayment(1000);

        //Assert
        assertTrue(result);
    }

    @Test
    public void payment_is_incorrect() {

        //Arrange
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        //Act
        Boolean result = paymentProcessor.makePayment(1000);

        //Assert
        assertFalse(result);
    }
}