package com.nayo.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nayo.web.entity.id.BookMarkId;

@Entity
public class Bookmark {
	
	@EmbeddedId
	private BookMarkId id;
	
	public Bookmark() {
		
	}

	public Bookmark(long recipeId, String regId) {
		super();
		this.id = new BookMarkId(recipeId, regId);
	}

	public long getRecipeId() {
		return id.getRecipeId();
	}

	public void setRecipeId(long recipeId) {
		id.setRecipeId(recipeId);
	}

	public String getRegId() {
		return id.getRegId();
	}

	public void setRegId(String regId) {
		id.setRegId(regId);
	}

	@Override
	public String toString() {
		return "Bookmark [id=" + id + ", getRecipeId()=" + getRecipeId() + ", getRegId()=" + getRegId() + "]";
	}
	
}
