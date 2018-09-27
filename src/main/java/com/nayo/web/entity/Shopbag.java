package com.nayo.web.entity;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nayo.web.entity.id.ShopbagId;

@Entity
public class Shopbag {
	
	@EmbeddedId
	private ShopbagId id;
	
	public Shopbag() {
		
	}
	
	
	
	public Shopbag(String name, String regId) {
		this.id = new ShopbagId(name, regId);
	}



	public String getName() {
		return id.getName();
	}

	public void setName(String name) {
		id.setName(name);
	}

	public String getRegId() {
		return id.getRegId();
	}

	public void setRegId(String regId) {
		id.setRegId(regId);
	}

	@Override
	public String toString() {
		return "Shopbag [id=" + id + ", getName()=" + getName() + ", getRegId()=" + getRegId() + "]";
	}
	
}
