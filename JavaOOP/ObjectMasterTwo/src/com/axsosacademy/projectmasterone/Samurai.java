
package com.axsosacademy.projectmasterone;
import java.util.*;
public class Samurai extends Human{
	private ArrayList<Samurai> samurai;
	public Samurai() {
		this.setHealth(200);
		this.samurai = new ArrayList<Samurai>();
		setSamurai(this);
	}
	public void setSamurai(Samurai samurai) {
		this.samurai.add(samurai);
	}
	public ArrayList<Samurai> getSamurai(){
		return this.samurai;
	}
	public void deathBlow(Human human) {
		this.reduceSamuraiHealthCauseOfSamurai();
		human.reduceHealthCauseOfSamurai();
	}
	public void meditate() {
		this.modifyHealthForSamurai();
	}
	public int howMany() {
		ArrayList<Samurai> si = this.getSamurai();
		return si.size();
	}
}
