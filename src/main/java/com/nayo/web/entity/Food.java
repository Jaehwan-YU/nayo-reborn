package com.nayo.web.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food {
	
	@Id
	private long id;
	private String name;
	private int foodLife;
	private Date sellLife;
	private Date regDate;
	private Date useDate;
	private String regEmail;
	private int foodCateId;
	private int keepAreaId;
	private String foodImg;
	
	public Food() {
		
	}

	public Food(long id, String name, int foodLife, Date sellLife, Date regDate, Date useDate, String regEmail,
			int foodCateId, int keepAreaId, String foodImg) {
		super();
		this.id = id;
		this.name = name;
		this.foodLife = foodLife;
		this.sellLife = sellLife;
		this.regDate = regDate;
		this.useDate = useDate;
		this.regEmail = regEmail;
		this.foodCateId = foodCateId;
		this.keepAreaId = keepAreaId;
		this.foodImg = foodImg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getSellLife() {
		return sellLife;
	}

	public void setSellLife(Date sellLife) {
		this.sellLife = sellLife;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUseDate() {
		return useDate;
	}

	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
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

	public String getFoodImg() {
		return foodImg;
	}

	public void setFoodImg(String foodImg) {
		this.foodImg = foodImg;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", foodLife=" + foodLife + ", sellLife=" + sellLife + ", regDate="
				+ regDate + ", useDate=" + useDate + ", regEmail=" + regEmail + ", foodCateId=" + foodCateId
				+ ", keepAreaId=" + keepAreaId + ", foodImg=" + foodImg + "]";
	}
	
	
}
