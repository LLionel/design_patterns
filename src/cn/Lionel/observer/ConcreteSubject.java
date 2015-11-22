package cn.Lionel.observer;

public class ConcreteSubject extends Subject {

	public void doSomething()
	{
		System.out.println("do something...");
		notifyObserver() ;
	}
}
