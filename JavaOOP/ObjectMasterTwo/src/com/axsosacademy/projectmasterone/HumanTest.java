package com.axsosacademy.projectmasterone;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		
		//Should be 100/50/200
		System.out.println("Start health for Ninja : "+ninja.getHealth());
		System.out.println("Start health for Wizard : "+wizard.getHealth());
		System.out.println("Start health for Samurai : "+samurai.getHealth());
		
		//Should be 8
		System.out.println("Start intelligence for Wizard : "+wizard.getIntelligence());
		
		wizard.heal(ninja);
		//Should be 108
		System.out.println("heal from wizard to Ninja : "+ninja.getHealth());
		
		wizard.fireball(samurai);
		//should be 176
		System.out.println("fireball from wizart at samurai : "+samurai.getHealth());
		
		//should be 10
		System.out.println("Start stealth for ninja : "+ninja.getStealth());
		
		ninja.steal(samurai);
		//should be 166
		System.out.println("steal from samurai by ninja : "+samurai.getHealth());
		
		//should be 118
		System.out.println("ninja health after stealing from samurai :"+ninja.getHealth());
		
		ninja.runAway();
		//should be 108
		System.out.println("ninjas health after running away : "+ninja.getHealth());
		
		samurai.deathBlow(wizard);
		//should be 0
		System.out.println("wizard health after deathBlow attack : "+wizard.getHealth());
		//should be 83
		System.out.println("samurai health after attacking wizard with deathBlow : "+samurai.getHealth());
		
		samurai.meditate();
		//should be 124
		System.out.println("samurai health after meditiation : "+samurai.getHealth());
		//should be 1
		System.out.println("total number of samurai : "+samurai.howMany());
	}

}
