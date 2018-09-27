package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReportCate {
	
	@Id
	private int id;
	private String name;
	
	public ReportCate(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ReportCate [id=" + id + ", name=" + name + "]";
	}
	
}
