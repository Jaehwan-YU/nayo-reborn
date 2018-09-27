package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingredients {
	
	@Id
	private long id;
	private long recipeId;
	private String name;
	private String quantity;
	private Boolean isMain;
	
	public Ingredients() {
		// TODO Auto-generated constructor stub
	}

	public Ingredients(long id, long recipeId, String name, String quantity, Boolean isMain) {
		super();
		this.id = id;
		this.recipeId = recipeId;
		this.name = name;
		this.quantity = quantity;
		this.isMain = isMain;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Boolean getIsMain() {
		return isMain;
	}

	public void setIsMain(Boolean isMain) {
		this.isMain = isMain;
	}

	@Override
	public String toString() {
		return "Ingredients [id=" + id + ", recipeId=" + recipeId + ", name=" + name + ", quantity=" + quantity
				+ ", isMain=" + isMain + "]";
	}
	
	
}
