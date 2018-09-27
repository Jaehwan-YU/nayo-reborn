package com.nayo.web.entity;

import javax.persistence.Entity;

@Entity
public class Mill {

	private int id;
	private String name;
	
	public Mill() {
		// TODO Auto-generated constructor stub
	}

	public Mill(int id, String name) {
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
		return "Mill [id=" + id + ", name=" + name + "]";
	}
	
}
