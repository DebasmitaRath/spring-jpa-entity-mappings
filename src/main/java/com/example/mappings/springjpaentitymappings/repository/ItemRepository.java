package com.example.mappings.springjpaentitymappings.repository;


import com.example.mappings.springjpaentitymappings.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}
