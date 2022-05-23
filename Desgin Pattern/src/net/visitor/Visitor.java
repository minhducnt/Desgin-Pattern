package net.visitor;

public interface Visitor {
	public void visit(Banana b);
	public void visit(Water w);
	public void visit(Chair c);
}
