package net.strategy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Router r = new Router();
		r.setCalculator(new SumCalculator());
		r.calTwoNumber(4, 4);
		
		System.out.print("\n");
		
		r.setCalculator(new SubCalculator());
		r.calTwoNumber(4, 4);
	}
}
