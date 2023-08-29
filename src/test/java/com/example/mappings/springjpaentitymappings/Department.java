package com.example.mappings.springjpaentitymappings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String name;

}
