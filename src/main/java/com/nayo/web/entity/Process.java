package com.nayo.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nayo.web.entity.id.ProcessId;


@Entity
public class Process {
	
	@EmbeddedId
	private ProcessId id;
	private String content;
	private String img;
	
	public Process() {
		// TODO Auto-generated constructor stub
	}

	public Process(long recipeId, int processNum, String content, String img) {
		super();
		this.id = new ProcessId(recipeId, processNum);
		this.content = content;
		this.img = img;
	}
	
	public long getRecipeId() {
		return id.getRecipeId();
	}

	public void setRecipeId(long recipeId) {
		id.setRecipeId(recipeId);
	}

	public int getProcessNum() {
		return id.getProcessNum();
	}

	public void setProcessNum(int processNum) {
		id.setProcessNum(processNum);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Process [id=" + id + ", content=" + content + ", img=" + img + ", getRecipeId()=" + getRecipeId()
				+ ", getProcessNum()=" + getProcessNum() + "]";
	}
	
	
	
}
