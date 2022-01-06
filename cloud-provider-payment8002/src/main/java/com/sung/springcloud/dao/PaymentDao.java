package com.sung.springcloud.dao;

import com.sung.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

	int create(Payment payment);
	
	Payment getPaymentById(@Param("id") Long id);
}
