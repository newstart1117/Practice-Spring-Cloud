package com.sung.springcloud.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sung.springcloud.dao.PaymentDao;
import com.sung.springcloud.entities.Payment;
import com.sung.springcloud.services.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentDao paymentDao;
	

	@Override
	public int create(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		// TODO Auto-generated method stub
		return paymentDao.getPaymentById(id);
	}

}
