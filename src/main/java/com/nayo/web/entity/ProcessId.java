package com.nayo.web.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProcessId implements Serializable{

	private long recipeId;
	private int processNum;
	
	public ProcessId() {
		// TODO Auto-generated constructor stub
	}

	public ProcessId(long recipeId, int processNum) {
		super();
		this.recipeId = recipeId;
		this.processNum = processNum;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}

	public int getProcessNum() {
		return processNum;
	}

	public void setProcessNum(int processNum) {
		this.processNum = processNum;
	}

	@Override
	public String toString() {
		return "ProcessId [recipeId=" + recipeId + ", processNum=" + processNum + "]";
	}
	
	
}
