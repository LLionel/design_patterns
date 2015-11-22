package cn.Lionel.observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("观察者已接受到通知");
	}

}
