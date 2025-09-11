package com.elkabani.firstspringboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder(){
      //  var paymentService = new PaypalPaymentService();
        paymentService.processPayment(100);
    }
}
