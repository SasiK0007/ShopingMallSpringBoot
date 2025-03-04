package com.example.demo.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.ShopDTO;
import com.example.demo.entities.Shop;
import com.example.demo.repos.ShopRepo;
import com.example.demo.services.ShopService;

@Service
public class ShopServiceImplementation implements ShopService {

	@Autowired
	private ShopRepo repo;
	@Override
	public ShopDTO addShop(ShopDTO shopDTO) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		shop.setId(1l);
		shop.setCustomers("he");
		shop.setShopId(1l);
		shop.setLeaseStatus("eeee");
		shop.setShopCategory("eeee");
		shop.setShopName("held");
		shop.setShopStatus("trues");
		Shop ax = repo.save(shop);
		ShopDTO shopDTO2 = new ShopDTO();
		shopDTO2.setCustomers(ax.getCustomers());
		shopDTO2.setEmployee(ax.getEmployee());
		shopDTO2.setId(ax.getId());
		shopDTO2.setLeaseStatus(ax.getLeaseStatus());
		shopDTO2.setShopId(ax.getShopId());
		shopDTO2.setShopName(ax.getShopName());
		shopDTO2.setShopStatus(ax.getShopStatus());
		return shopDTO2;
		
	}

}
