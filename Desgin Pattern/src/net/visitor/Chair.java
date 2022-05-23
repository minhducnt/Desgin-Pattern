package net.visitor;

public class Chair implements Things {
	public String getMehthod() {
		return "U can sit on chair, geart";
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
}
