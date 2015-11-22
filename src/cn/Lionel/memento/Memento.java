package cn.Lionel.memento;

public class Memento {

	String state ;
	
	public Memento(String state) {
		super();
		this.state = state;
	}
	/**
	 * 
	 * @return
	 */
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	

}
