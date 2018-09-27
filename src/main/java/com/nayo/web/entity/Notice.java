package com.nayo.web.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notice {
		
	@Id
	private int id;
	private String title;
	private String content;
	private Date regDate;
	private String regId;
	private int noticeCateId;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}

	public Notice(int id, String title, String content, Date regDate, String regId, int noticeCateId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.regId = regId;
		this.noticeCateId = noticeCateId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public int getNoticeCateId() {
		return noticeCateId;
	}

	public void setNoticeCateId(int noticeCateId) {
		this.noticeCateId = noticeCateId;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", regId="
				+ regId + ", noticeCateId=" + noticeCateId + "]";
	}
	
}
