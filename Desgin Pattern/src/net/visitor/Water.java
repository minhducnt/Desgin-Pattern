package net.visitor;

public class Water implements Things {
	public String getMehthod() {
		return "U can drink water";
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
