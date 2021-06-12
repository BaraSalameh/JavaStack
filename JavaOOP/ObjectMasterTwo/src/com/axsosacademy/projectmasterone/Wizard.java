package com.axsosacademy.projectmasterone;

public class Wizard extends Human{
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	public void heal(Human human) {
		human.modifyHealthFromWizard(this.getIntelligence());
	}
	public void fireball(Human human) {
		human.reduceHealthFromWizard(this.getIntelligence());
	}
}
