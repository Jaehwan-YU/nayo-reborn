package com.nayo.web.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	
	@Id
	private long id;
	private String regId;
	private Date menuDate;
	private int millId;
	private long recipeId;
	private String menuImg;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(long id, String regId, Date menuDate, int millId, long recipeId, String title, String menuImg) {
		super();
		this.id = id;
		this.regId = regId;
		this.menuDate = menuDate;
		this.millId = millId;
		this.recipeId = recipeId;
		this.menuImg = menuImg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Date getMenuDate() {
		return menuDate;
	}

	public void setMenuDate(Date menuDate) {
		this.menuDate = menuDate;
	}

	public int getMillId() {
		return millId;
	}

	public void setMillId(int millId) {
		this.millId = millId;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}
	
	public String getMenuImg() {
		return menuImg;
	}

	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", regId=" + regId + ", menuDate=" + menuDate + ", millId=" + millId + ", recipeId="
				+ recipeId + ", menuImg=" + menuImg + "]";
	}

	
}
