package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
	
	@Id
	private String id;
	private String email;
	private String pwd;
	private String nickname;
	private String birth;
	private int gender;
	private String profileImg;
	private String intro;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String email, String pwd, String nickname, String birth, int gender, String profileImg,
			String intro) {
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
		this.nickname = nickname;
		this.birth = birth;
		this.gender = gender;
		this.profileImg = profileImg;
		this.intro = intro;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", pwd=" + pwd + ", nickname=" + nickname + ", birth=" + birth
				+ ", gender=" + gender + ", profileImg=" + profileImg + ", intro=" + intro + "]";
	}
	
}
