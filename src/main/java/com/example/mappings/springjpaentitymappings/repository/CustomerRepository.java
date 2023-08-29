package com.example.mappings.springjpaentitymappings.repository;

import com.example.mappings.springjpaentitymappings.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
