package cn.Lionel.observer;

import java.util.ArrayList;

public abstract class Subject {

	private ArrayList<Observer> list = new ArrayList<Observer>() ;
	
	public void register(Observer observer) 
	{
		list.add(observer);
		
	}
	public void removeObserver(Observer observer)
	{
		list.remove(observer);
		
	}
	public void notifyObserver()
	{
		for(Observer o : list)
		{
			o.update();
		}
	}
	
}
