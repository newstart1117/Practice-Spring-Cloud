package com.sung.springcloud.services;

import org.apache.ibatis.annotations.Param;

import com.sung.springcloud.entities.Payment;

public interface PaymentService {

	int create(Payment payment);
	
	Payment getPaymentById(@Param("id") Long id);
}
