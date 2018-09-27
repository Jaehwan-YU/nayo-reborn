package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class National {

	@Id
	private int id;
	private String name;
	
	public National(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "National [id=" + id + ", name=" + name + "]";
	}
	
	
}
