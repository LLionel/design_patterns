package cn.Lionel.observer;

import org.junit.Test;

public class Client {

	@Test
	public void test()
	{
		ConcreteSubject s = new ConcreteSubject() ;
		Observer o =  new ConcreteObserver() ;
		s.register(o);
		s.doSomething();
	}
}
