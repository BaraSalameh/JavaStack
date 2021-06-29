package com.axsosacademy.countries.mvc.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="languages")
public class Language {
	//Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String countryCode;
	private String language;
	private boolean isOfficial;
	private float percentage;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_id")
	private Country country;
	
	//Constructors
	public Language() {
		
	}

	public Language(String countryCode, String language, boolean isOfficial, float percentage,
			Country country) {
		this.countryCode = countryCode;
		this.language = language;
		this.isOfficial = isOfficial;
		this.percentage = percentage;
		this.country = country;
	}
	
	//GettersAndSetters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isOfficial() {
		return isOfficial;
	}
	public void setOfficial(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
