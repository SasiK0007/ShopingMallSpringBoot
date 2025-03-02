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
	private long id;
	private String mallName;
	private String location;
	private String categories;
	@OneToOne
	@JoinColumn(name = "mall_admin_id",referencedColumnName = "id")
	private MallAdmin mallAdmin;
}
