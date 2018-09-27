package com.nayo.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	@Id
	private long id;
	private String title;
	private String simpleIntro;
	private String mainImg;
	private String regEmail;
	private int kcalory;
	private int nationalId;
	private int situationId;
	private int recipeTypeId;

	public Recipe() {
		// TODO Auto-generated constructor stub
	}

	public Recipe(long id, String title, String simpleIntro, String mainImg, String regEmail, int kcalory,
			int nationalId, int situationId, int recipeTypeId) {
		super();
		this.id = id;
		this.title = title;
		this.simpleIntro = simpleIntro;
		this.mainImg = mainImg;
		this.regEmail = regEmail;
		this.kcalory = kcalory;
		this.nationalId = nationalId;
		this.situationId = situationId;
		this.recipeTypeId = recipeTypeId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSimpleIntro() {
		return simpleIntro;
	}

	public void setSimpleIntro(String simpleIntro) {
		this.simpleIntro = simpleIntro;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
	}

	public int getKcalory() {
		return kcalory;
	}

	public void setKcalory(int kcalory) {
		this.kcalory = kcalory;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public int getSituationId() {
		return situationId;
	}

	public void setSituationId(int situationId) {
		this.situationId = situationId;
	}

	public int getRecipeTypeId() {
		return recipeTypeId;
	}

	public void setRecipeTypeId(int recipeTypeId) {
		this.recipeTypeId = recipeTypeId;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", simpleIntro=" + simpleIntro + ", mainImg=" + mainImg
				+ ", regEmail=" + regEmail + ", kcalory=" + kcalory + ", nationalId=" + nationalId + ", situationId="
				+ situationId + ", recipeTypeId=" + recipeTypeId + "]";
	}
	
}