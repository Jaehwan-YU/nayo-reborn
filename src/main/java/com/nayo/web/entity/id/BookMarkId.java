package com.nayo.web.entity.id;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BookMarkId implements Serializable{
	
	private long recipeId;
	private String regId;

	public BookMarkId() {
		// TODO Auto-generated constructor stub
	}

	public BookMarkId(long recipeId, String regId) {
		super();
		this.recipeId = recipeId;
		this.regId = regId;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	@Override
	public String toString() {
		return "BookMarkId [recipeId=" + recipeId + ", regId=" + regId + "]";
	}
	
}
