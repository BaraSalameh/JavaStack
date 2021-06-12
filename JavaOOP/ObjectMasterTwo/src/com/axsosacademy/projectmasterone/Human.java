package com.axsosacademy.projectmasterone;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	
	//Seters
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	//Geters
	public int getStrength() {
		return this.strength;
	}
	public int getHealth() {
		return this.health;
	}
	public int getStealth() {
		return this.stealth;
	}
	public int getIntelligence() {
		return this.intelligence;
	}
	
	
	//Modifires
	public void modifyHealthForSamurai() {
		this.setHealth(this.getHealth()+this.getHealth()/2);
	}
	public void modifyHealthFromWizard(int wizarIntelligence) {
		this.health += wizarIntelligence;
	}
	public void reduceHealthFromWizard(int wizarIntelligence) {
		this.health -= wizarIntelligence*3;
	}
	public void modifyHealthForNinja(int plusHealth) {
		this.health += plusHealth;
	}
	public void reduceHealthForNinja(int ninjaStealth) {
		this.health -= ninjaStealth;
	}
	public void reduceHealthCauseOfNinja(int ninjaStealth) {
		this.health -= ninjaStealth;
	}
	public void reduceSamuraiHealthCauseOfSamurai() {
		this.health = this.health/2;
	}
	public void reduceHealthCauseOfSamurai() {
		this.setHealth(0);
	}
	
	public void attack(Human human) {
		human.setHealth(getStrength());
	}
	
}
