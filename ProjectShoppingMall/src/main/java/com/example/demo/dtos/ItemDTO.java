package com.example.demo.dtos;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
public class ItemDTO {
	private Long id;
	private String name;
	private LocalDate manufacturing;
	private LocalDate expiry;
	private float price;
	private String category;
}
