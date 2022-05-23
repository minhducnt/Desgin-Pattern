package net.visitor;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visitor v = new VisitorImp();
		Things b = new Banana();
		Things w = new Water();
		Things c = new Chair();
		
		ArrayList<Things> Sum = new ArrayList<>();
		Sum.add(b);
		Sum.add(w);
		Sum.add(c);
		
		for(int i = 0 ; i < 3; i++) {
			Sum.get(i).accept(v);
			System.out.print("\n");
		}
	}

}
