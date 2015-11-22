package cn.Lionel.singleton;

/**
 * 
 * 两种方法，一种饿汉式 ，一种懒汉式
 * 建议使用饿汉式，synchronized太耗时，
 * @author Lionel
 *
 */


public class Singleton {

	//第一种方法饿汉式，推荐使用.
	 private static Singleton myInstance = new Singleton() ;
	 
	 private Singleton() {
	 
	 }
	 
	 public static Singleton getInstance() { return myInstance ; }
	 

	/*
	//第二种方法，懒汉式
	private static Singleton myInstance ;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if(myInstance == null)
		{
			myInstance = new Singleton();
		}
		return myInstance ;
	}*/

}
