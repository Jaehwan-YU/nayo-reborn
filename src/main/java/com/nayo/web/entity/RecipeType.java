package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RecipeType {
	
	@Id
	private int id;
	private String name;
	
	public RecipeType(int id, String name) {
		super();
		this.name = name;
		this.id = id;
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
		return "RecipeType [name=" + name + ", id=" + id + "]";
	}
	
	
}
