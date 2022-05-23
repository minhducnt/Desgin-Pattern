package net.visitor;

public class Banana implements Things {
	public String getMehthod() {
		return "U can eat banana, sound good!";
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
