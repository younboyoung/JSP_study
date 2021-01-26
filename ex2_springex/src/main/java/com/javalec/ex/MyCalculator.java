package com.javalec.ex;

public class MyCalculator {
	
	public Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public MyCalculator() {
		
	}
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
}
