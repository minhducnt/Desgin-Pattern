package net.memento;

public class Originator {
	private String state;

	public String getState() {
		return state + "\n";
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveState() {
		return new Memento(state);
	}
	
	public void restoreState(Memento memento) {
		state = memento.getState();
		System.out.print("Restore form " + state);
	}
}
