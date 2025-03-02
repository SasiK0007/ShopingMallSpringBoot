package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopOwnerId",referencedColumnName = "id")
	private ShopOwner shopOwner;
	private String leaseStatus;
	private long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopEmployeeID",referencedColumnName = "id")
	private Employee employee;
	
}
