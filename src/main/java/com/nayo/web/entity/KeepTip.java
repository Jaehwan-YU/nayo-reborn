package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KeepTip {
	
	@Id
	private String name;
	private int foodLife;
	private String foodCate;
	private int keepAreaId;
	
	public KeepTip() {
		// TODO Auto-generated constructor stub
	}
	
	public KeepTip(String name, int foodLife, String foodCate, int keepAreaId) {
		super();
		this.name = name;
		this.foodLife = foodLife;
		this.foodCate = foodCate;
		this.keepAreaId = keepAreaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFoodLife() {
		return foodLife;
	}

	public void setFoodLife(int foodLife) {
		this.foodLife = foodLife;
	}

	public String getFoodCate() {
		return foodCate;
	}

	public void setFoodCate(String foodCate) {
		this.foodCate = foodCate;
	}

	public int getKeepAreaId() {
		return keepAreaId;
	}

	public void setKeepAreaId(int keepAreaId) {
		this.keepAreaId = keepAreaId;
	}

	@Override
	public String toString() {
		return "KeepTip [name=" + name + ", foodLife=" + foodLife + ", foodCate=" + foodCate + ", keepAreaId="
				+ keepAreaId + "]";
	}
	
	
	
}
