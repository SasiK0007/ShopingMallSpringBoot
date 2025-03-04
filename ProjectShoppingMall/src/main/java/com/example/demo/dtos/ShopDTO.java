package com.example.demo.dtos;

import com.example.demo.entities.Employee;
import com.example.demo.entities.ShopOwner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopDTO {
	private long shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	private String leaseStatus;
	private Long id;
	private ShopOwner shopOwner;
	private Employee employee;
}
