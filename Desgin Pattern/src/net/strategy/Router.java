package net.strategy;

public class Router {
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void calTwoNumber(double number_1, double number_2) {
		System.out.print(calculator.execute(number_1, number_2));
	}
}
