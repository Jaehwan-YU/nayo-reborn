package com.nayo.web.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	
	@Id
	private long id;
	private String regEmail;
	private Date menuDate;
	private int millId;
	private long recipeId;
	private String title;
	private String menuImg;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(long id, String regEmail, Date menuDate, int millId, long recipeId, String title, String menuImg) {
		super();
		this.id = id;
		this.regEmail = regEmail;
		this.menuDate = menuDate;
		this.millId = millId;
		this.recipeId = recipeId;
		this.title = title;
		this.menuImg = menuImg;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMenuImg() {
		return menuImg;
	}

	public void setMenuImg(String menuImg) {
		this.menuImg = menuImg;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", regEmail=" + regEmail + ", menuDate=" + menuDate + ", millId=" + millId
				+ ", recipeId=" + recipeId + ", title=" + title + ", menuImg=" + menuImg + "]";
	}
	
	
}
