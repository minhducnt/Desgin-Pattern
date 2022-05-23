package net.visitor;

public class VisitorImp implements Visitor {

	@Override
	public void visit(Banana b) {
		// TODO Auto-generated method stub
		System.out.print(b.getMehthod());
	}

	@Override
	public void visit(Water w) {
		// TODO Auto-generated method stub
		System.out.print(w.getMehthod());
	}

	@Override
	public void visit(Chair c) {
		// TODO Auto-generated method stub
		System.out.print(c.getMehthod());
	}

}
