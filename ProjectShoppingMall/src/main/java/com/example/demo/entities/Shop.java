package com.example.demo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "shop")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopOwnerId",referencedColumnName = "id")
	private ShopOwner shopOwner;
	private String leaseStatus;
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "shopEmployeeID",referencedColumnName = "id")
	private Employee employee;
	public long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
//	public ShopOwner getShopOwner() {
//		return shopOwner;
//	}
//	public void setShopOwner(ShopOwner shopOwner) {
//		this.shopOwner = shopOwner;
//	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public Employee getEmployee() {
//		return employee;
//	}
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
	
	
}
