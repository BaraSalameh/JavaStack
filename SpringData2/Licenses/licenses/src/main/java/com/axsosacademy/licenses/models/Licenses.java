package com.axsosacademy.licenses.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class Licenses {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer number; 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expirationDate;
	private String state;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Persons person;
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Licenses() {
		
	}
	public Licenses(Date expirationDate, String state, Persons person) {
		this.expirationDate = expirationDate;
		this.state = state;
		this.person = person;
	}
	
	public Long getId() {
		return id;
	}
	public Integer getNumber() {
		return number;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Persons getPerson() {
		return person;
	}
	public void setPerson(Persons person) {
		this.person = person;
	}
	
	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}
}
