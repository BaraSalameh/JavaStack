package com.axsosacademy.calculatorpartone;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator one = new Calculator();
		
		//should be 0.0
		System.out.println(one .getResult());
		
		Calculator two = new Calculator();
		two.performOperation(10.5, '+', 5.2);
		//should be 15.7
		System.out.println(two.getResult());
		two.performOperation(10, '-', 5);
		
		//should be 5
		System.out.println(two.getResult());
	}

}
