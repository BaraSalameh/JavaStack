package com.axsosacademy.projectmasterone;

public class Ninja extends Human{
	public Ninja() {
		this.setStealth(10);
	}
	public void steal(Human human) {
		this.modifyHealthForNinja(this.getStealth());
		human.reduceHealthCauseOfNinja(this.getStealth());
	}
	public void runAway() {
		this.reduceHealthForNinja(10);
	}
}
