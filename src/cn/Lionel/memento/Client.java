package cn.Lionel.memento;

import org.junit.Test;

public class Client {

	@Test
	public void test()
	{
		Originator org = new Originator("state 1 ...");
		org.showState();
		CareTaker ct = new CareTaker() ;
		ct.setMemento(org.createMemento());
		org.setState("state 2 ...");
		org.showState();
		org.setMemento(ct.getMemento());
		org.showState();
	}
	
}
