package com.example.mappings.springjpaentitymappings;

import com.example.mappings.springjpaentitymappings.entity.Customer;
import com.example.mappings.springjpaentitymappings.entity.Item;
import com.example.mappings.springjpaentitymappings.repository.CustomerRepository;
import com.example.mappings.springjpaentitymappings.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJpaEntityMappingsApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringJpaEntityMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Customer customer=new Customer("Tom");

		Item item1=new Item("Item1");
		Item item2=new Item("Item2");


		customer.getItems().add(item1);
		customer.getItems().add(item2);

		/*item1.setCustomer(customer);
		item2.setCustomer(customer);*/

		customerRepository.save(customer);


	}
}
