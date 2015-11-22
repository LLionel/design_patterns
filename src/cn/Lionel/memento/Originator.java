package cn.Lionel.memento;

public class Originator {

	String state;

	public Originator(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento()
	{
		return new Memento(state) ;
	}
	
	public void setMemento(Memento memento)
	{
		state = memento.getState() ;
	}
	
	public void showState()
	{
		System.out.println(state);
	}
	
}
