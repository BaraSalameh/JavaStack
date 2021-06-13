package com.axsosacademy.phoneassignment;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone elevenProMax = new IPhone("x0201611823", 95 , "ooredoo" , "OverTheHorizone");
		IPhone sevenPlus = new IPhone("x0201911755", 83 , "jawwal" , "TikTok");
		Galaxy noteTwanyUltra = new Galaxy("f0853678043" , 97 , "zain" , "waterfall");
		
		//should be x0201611823 / 95 / ooredoo / OverTheHorizon
		elevenProMax.displayInfo();
		
		//should be f0853678043 / 97 / zain / watefall
		noteTwanyUltra.displayInfo();
		
		//should be TikTok
		System.out.println(sevenPlus.ring());
		
		//should be information about the object himself
		System.out.println(sevenPlus.unlock());
	}

}
