package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Item;

public interface ItemRepo extends JpaRepository<Item, Long> {

}
