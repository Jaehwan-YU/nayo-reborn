package com.nayo.web.entity.id;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ShopbagId implements Serializable{
	
	private String name;
	private String regId;
	
	public ShopbagId() {
		// TODO Auto-generated constructor stub
	}

	public ShopbagId(String name, String regId) {
		super();
		this.name = name;
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	@Override
	public String toString() {
		return "ShopbagId [name=" + name + ", regId=" + regId + "]";
	}
	
	
}
