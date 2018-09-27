package com.nayo.web.entity.id;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ReportId implements Serializable{
	
	private String regId;
	private long recipeId;
	
	public ReportId() {
		// TODO Auto-generated constructor stub
	}
	
	public ReportId(String regId, long recipeId) {
		super();
		this.regId = regId;
		this.recipeId = recipeId;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}

	@Override
	public String toString() {
		return "ReportId [regId=" + regId + ", recipeId=" + recipeId + "]";
	}
	
	
}
