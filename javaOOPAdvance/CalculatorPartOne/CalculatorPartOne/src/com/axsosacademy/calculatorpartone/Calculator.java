package com.axsosacademy.calculatorpartone;

public class Calculator {
	//fileds
	private double operandOne;
	private char operation;
	private double operandTwo;
	private double result;
	
	//constructors
	public Calculator() {
		this.operandOne = 0.0;
		this.operandTwo = 0.0;
		this.result = 0.0;
	}
	
	//getersSeters
	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public char getOperation() {
		return operation;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	//modifires
	public void performOperation(double operandOne , char operation , double operandTwo) {
		this.setOperandOne(operandOne);
		this.setOperation(operation);
		this.setOperandTwo(operandTwo);
		if(this.getOperation() == '+') {
			this.setResult(this.getOperandOne() + this.getOperandTwo());
		}
		else if(this.getOperation() == '-') {
			this.setResult(this.getOperandOne() - this.getOperandTwo());
		}
		else {
			System.out.println("The operation inserted not acceptable!");
		}
	}
}
