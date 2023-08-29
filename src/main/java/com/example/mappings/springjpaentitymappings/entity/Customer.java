package com.example.mappings.springjpaentitymappings.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Customer(String name){
        this.name=name;

    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name ="customer_item",
            joinColumns = { @JoinColumn(name ="customer_fk") },
            inverseJoinColumns = { @JoinColumn(name = "item_fk") })

    private Set<Item> items=new HashSet<>();

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
