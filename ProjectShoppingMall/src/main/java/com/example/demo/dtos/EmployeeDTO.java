package com.example.demo.dtos;

import com.example.demo.entities.OrderDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
	private Long id;
	private String name;
	private String phone;
	private String email;
	private OrderDetails orderDetails;
}
