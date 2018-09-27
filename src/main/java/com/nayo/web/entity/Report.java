package com.nayo.web.entity;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Report {
	
	@EmbeddedId
	private ReportId id;
	private int reportCateId;
	private String content;
	private Date regDate;
	
	public Report() {
		// TODO Auto-generated constructor stub
	}
	
	public Report(String regId, long recipeId, int reportCateId, String content, Date regDate) {
		super();
		this.id = new ReportId(regId, recipeId);
		this.reportCateId = reportCateId;
		this.content = content;
		this.regDate = regDate;
	}
	

	public String getRegId() {
		return id.getRegId();
	}

	public void setRegId(String regId) {
		id.setRegId(regId);
	}

	public long getRecipeId() {
		return id.getRecipeId();
	}

	public void setRecipeId(long recipeId) {
		id.setRecipeId(recipeId);
	}

	public int getReportCateId() {
		return reportCateId;
	}

	public void setReportCateId(int reportCateId) {
		this.reportCateId = reportCateId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", reportCateId=" + reportCateId + ", content=" + content + ", regDate=" + regDate
				+ ", getRegId()=" + getRegId() + ", getRecipeId()=" + getRecipeId() +"]";
	}
	
}
