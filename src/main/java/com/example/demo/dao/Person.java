package com.example.demo.dao;

import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
