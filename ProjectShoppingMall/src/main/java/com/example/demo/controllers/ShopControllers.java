package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.ShopDTO;
import com.example.demo.services.ShopService;

@RestController
public class ShopControllers {

	@Autowired
	private ShopService shopService;
	@PostMapping("/api/shop")
	public ResponseEntity<ShopDTO>shops(ShopDTO shopDTO){
		return new ResponseEntity<ShopDTO>(shopService.addShop(shopDTO),HttpStatus.CREATED);
	}
}
