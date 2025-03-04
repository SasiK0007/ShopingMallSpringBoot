package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "mall")
public class Mall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mallName;
	private String location;
	private String categories;
	@OneToOne
	@JoinColumn(name = "mall_admin_id",referencedColumnName = "id")
	private MallAdmin mallAdmin;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public MallAdmin getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	
}
