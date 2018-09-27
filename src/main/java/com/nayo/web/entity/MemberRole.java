package com.nayo.web.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.nayo.web.entity.id.MemberRoleId;

@Entity
public class MemberRole {

	@EmbeddedId
	private MemberRoleId id;
	private boolean isDefault;
	
	public MemberRole() {
		// TODO Auto-generated constructor stub
	}

	public MemberRole(String memberId,String roleName, boolean isDefault) {
		super();
		this.id = new MemberRoleId(memberId, roleName);
		this.isDefault = isDefault;
	}

	public String getMemberId() {
		return id.getMemberId();
	}

	public void setMemberId(String memberId) {
		id.setMemberId(memberId);
	}

	public String getRoleName() {
		return id.getRoleName();
	}

	public void setRoleName(String roleName) {
		id.setRoleName(roleName);
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "MemberRole [id=" + id + ", isDefault=" + isDefault + ", getMemberId()=" + getMemberId()
				+ ", getRoleName()=" + getRoleName() + "]";
	}
	 
}
