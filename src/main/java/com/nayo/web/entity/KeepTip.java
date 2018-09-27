package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class KeepTip {
	
	@Id
	private String name;
	private int foodLife;
	private int foodCateId;
	private int keepAreaId;
	
	public KeepTip() {
		// TODO Auto-generated constructor stub
	}

	public KeepTip(String name, int foodLife, int foodCateId, int keepAreaId) {
		super();
		this.name = name;
		this.foodLife = foodLife;
		this.foodCateId = foodCateId;
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

	public int getFoodCateId() {
		return foodCateId;
	}

	public void setFoodCateId(int foodCateId) {
		this.foodCateId = foodCateId;
	}

	public int getKeepAreaId() {
		return keepAreaId;
	}

	public void setKeepAreaId(int keepAreaId) {
		this.keepAreaId = keepAreaId;
	}

	@Override
	public String toString() {
		return "KeepTip [name=" + name + ", foodLife=" + foodLife + ", foodCateId=" + foodCateId + ", keepAreaId="
				+ keepAreaId + "]";
	}
	
	
	
}
