package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopOwnerDTO {
	private Long id;
    private String name;
    private String contact;
    private String email;
}
