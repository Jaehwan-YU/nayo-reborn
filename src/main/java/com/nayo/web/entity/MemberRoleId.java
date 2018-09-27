package com.nayo.web.entity;

import javax.persistence.Embeddable;

@Embeddable
public class MemberRoleId {
	
	private String memberId;
	private String roleName;
	
	public MemberRoleId() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberRoleId(String memberId, String roleName) {
		super();
		this.memberId = memberId;
		this.roleName = roleName;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "MemberRoleId [memberId=" + memberId + ", roleName=" + roleName + "]";
	}
	
	
}
