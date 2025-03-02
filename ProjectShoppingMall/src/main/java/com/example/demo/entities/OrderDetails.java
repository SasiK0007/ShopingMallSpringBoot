package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime dateOfPurchase;
	private float total;
	@OneToOne(mappedBy = "orderDetails",cascade = CascadeType.ALL)
	private Customer customer;
	private String paymentMode;
	@ManyToOne
	@JoinColumn(name = "shop_id")
	private Shop shop;
	
}
